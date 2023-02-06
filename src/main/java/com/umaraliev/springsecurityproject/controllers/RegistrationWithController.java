package com.umaraliev.springsecurityproject.controllers;

import com.umaraliev.springsecurityproject.dto.UserRegistrationDto;
import com.umaraliev.springsecurityproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
@RequiredArgsConstructor
public class RegistrationWithController {

    private final UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/registration")
    public ResponseEntity<UserRegistrationDto> registerUserAccount(@RequestBody UserRegistrationDto registrationDto) {
        userService.save(registrationDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
