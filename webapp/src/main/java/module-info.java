module com.peruncs.pcml.webapp {
    requires com.peruncs.pcml.webtemplates;
    requires io.helidon.webserver;
    requires io.helidon.webserver.staticcontent;
    //requires io.helidon.webclient;
    requires microstream.storage.embedded;
    requires io.helidon.integrations.microstream;
    requires microstream.persistence.binary.jdk17;
    //requires io.helidon.integrations.microstream.health;
    //requires io.helidon.integrations.microstream.metrics ;
    //requires  io.helidon.integrations.microstream.cache;
}
