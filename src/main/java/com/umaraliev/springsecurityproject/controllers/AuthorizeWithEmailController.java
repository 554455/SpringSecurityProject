package com.umaraliev.springsecurityproject.controllers;

import com.umaraliev.springsecurityproject.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AuthorizeWithEmailController {

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping("/login")
    public String getLoginEmailPage() {
        return "login";
    }
}
