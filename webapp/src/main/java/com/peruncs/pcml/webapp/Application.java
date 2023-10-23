package com.peruncs.pcml.webapp;


import io.helidon.common.media.type.MediaTypes;
import io.helidon.config.Config;
import io.helidon.webserver.WebServer;
import io.helidon.webserver.staticcontent.StaticContentService;
import one.microstream.persistence.binary.jdk17.types.BinaryHandlersJDK17;
import one.microstream.storage.embedded.configuration.types.EmbeddedStorageConfigurationBuilder;

import static io.helidon.config.ConfigSources.classpath;
import static io.helidon.config.ConfigSources.file;

final public class Application {

    private final Config config;
    private final WebServer webServer;
    private final HTMLandingPageService htmlLandingPage;
    private final ApiService apiService;

    private final AppRepository appRepository;


    private Application() {

        var configFile = System.getProperty("app.config", "config.yaml");

        config = Config.builder()
                //.disableEnvironmentVariablesSource()
                .sources(file(configFile).optional(),classpath("application.yaml"))
                .build();

//      A hack to configure storage  manager, see https://github.com/microstream-one/microstream/discussions/629
        var microStreamProperties =  config.get("microstream").detach().asMap().get();
        var embeddedStorageConfigurationBuilder = EmbeddedStorageConfigurationBuilder.New();
        microStreamProperties.forEach(embeddedStorageConfigurationBuilder::set);
        var embeddedStorageFoundation = embeddedStorageConfigurationBuilder.createEmbeddedStorageFoundation();
        embeddedStorageFoundation.onConnectionFoundation(BinaryHandlersJDK17::registerJDK17TypeHandlers);
        var embeddedStorageManager = embeddedStorageFoundation.createEmbeddedStorageManager();

        appRepository = new AppRepository(this, embeddedStorageManager);
        apiService = new ApiService(this);
        htmlLandingPage = new HTMLandingPageService(this);

        webServer = buildServer();

    }

    @SuppressWarnings("unchecked")
    private WebServer buildServer(){
        return WebServer.builder()
                .config(config.get("server"))
                .routing(rules ->
                        rules
                                .any("/*", (req , res) -> {
                                    res.headers().contentType(MediaTypes.TEXT_HTML);
                                    res.next();
                                })
                                .any("/api/*", ( req , res) -> {
                                    res.headers().contentType(MediaTypes.APPLICATION_JSON);
                                    res.next();
                                })
                                .register("/web-assets", StaticContentService.builder("templates/web-assets"))
                                .register(apiService)
                                .register(htmlLandingPage)
                                .build())
                .build();
    }

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        webServer.start();
    }

}
