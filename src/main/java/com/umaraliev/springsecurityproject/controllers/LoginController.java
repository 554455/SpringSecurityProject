package com.umaraliev.springsecurityproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class LoginController {

    @GetMapping("/login")
    String login() {
        return "login";
    }
}
