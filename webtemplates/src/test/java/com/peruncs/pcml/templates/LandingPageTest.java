package com.peruncs.pcml.templates;


import org.junit.jupiter.api.Test;

import java.util.List;


public class LandingPageTest {

    public static void main(String[] args) throws Exception {
        new LandingPageTest().testLandingPageWithAuthenticatedUser();
    }

    @Test
    public void testLandingPageWithAuthenticatedUser() throws Exception {
        LandingPage landingPage = new LandingPage(new LandingPage.User("TestUser",
                List.of(
                        "2023/07/10",
                        "2023/07/09",
                        "2023/07/07")));
        System.out.println(LandingPageRenderer.of().execute(landingPage));

//
//        String expected = "\"foo, bar, baz\"";
//
//        assertEquals(expected, r);
    }

    @Test
    public void testLandingPageNoAuthenticatedUser() throws Exception {
        LandingPage landingPage = new LandingPage(null);
        String r = LandingPageRenderer.of().execute(landingPage);
        System.out.println(r);

//
//        String expected = "\"foo, bar, baz\"";
//
//        assertEquals(expected, r);
    }

}
