package com.umaraliev.springsecurityproject.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Oauth2AuthenticationGoogle {

    @GetMapping("/oauth2/authorization/google")
    public String authenticationGoogle(AuthenticationPrincipal authenticationPrincipal) {
        System.out.println(authenticationPrincipal.toString());
        return "home";
    }
}
