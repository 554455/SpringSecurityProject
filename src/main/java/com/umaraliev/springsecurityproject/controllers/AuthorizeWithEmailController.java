package com.umaraliev.springsecurityproject.controllers;

import com.umaraliev.springsecurityproject.dto.UserRegistrationDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizeWithEmailController {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<UserRegistrationDto> userRegistrationDtoResponseEntity(@RequestBody UserRegistrationDto userRegistrationDto) {
        System.out.println(userRegistrationDto.getEmail());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
