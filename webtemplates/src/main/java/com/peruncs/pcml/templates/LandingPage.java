package com.peruncs.pcml.templates;

import io.jstach.jstache.JStache;

import java.util.List;

@JStache(path = "app")
public record LandingPage(User user) {
    public String render() {
        return LandingPageRenderer.of().execute(this);
    }

    public record User(String name, List<String> loginHistory) {
    }
}
