package com.peruncs.pcml.webapp;


import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.HttpService;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

record ApiService(Application application) implements HttpService {

    @Override
    public void routing(HttpRules rules) {
        rules
                .any("/api/test1", this::test1)
                .any("/api/test2", this::test2)
        ;
    }

    private void test1(ServerRequest req, ServerResponse res) {
        res.send("""
                test1 {
                }
                """);
    }

    private void test2(ServerRequest req, ServerResponse res) {
        res.send("""
                test2 {
                }
                """);
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
