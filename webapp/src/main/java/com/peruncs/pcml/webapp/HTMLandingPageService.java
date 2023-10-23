package com.peruncs.pcml.webapp;

import com.peruncs.pcml.templates.LandingPage;
import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.HttpService;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

import java.util.List;

record HTMLandingPageService(Application application) implements HttpService {


    @Override
    public void routing(HttpRules rules) {
        rules.any(this::handle);
    }

    private void handle(ServerRequest serverRequest, ServerResponse serverResponse) {

        var landingPage = new LandingPage(new LandingPage.User("TestUser",
                List.of(
                        "2023/07/10",
                        "2023/07/09",
                        "2023/07/07")));
        serverResponse.send(landingPage.render());
    }

//    @Override
//    public HttpService get() {
//        return HttpService.super.get();
//    }
//    @Override
//    public void beforeStart() {
//        HttpService.super.beforeStart();
//    }
//
//    @Override
//    public void afterStop() {
//        HttpService.super.afterStop();
//    }

}
