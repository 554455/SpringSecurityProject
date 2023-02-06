package com.umaraliev.springsecurityproject.controllers;

import com.umaraliev.springsecurityproject.dto.UserRegistrationDto;
import com.umaraliev.springsecurityproject.model.User;
import com.umaraliev.springsecurityproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RunWith(MockitoJUnitRunner.class)
class AuthorizeWithEmailControllerTest {

    @Mock
    private final UserService userService;

    @InjectMocks
    private UserRegistrationDto userRegistrationDto;

    @BeforeClass()
    void initializationEntity(){
        UserRegistrationDto userRegistrationDto = new UserRegistrationDto();
        userRegistrationDto.setEmail("some@mail.ru");
        userRegistrationDto.setPassword("12344");
        userRegistrationDto.setRoles(null);
    }


    @Test
    void userRegistrationDtoResponseEntity() {
        userService.save(userRegistrationDto);
        User user = userService.getUser(userRegistrationDto.getEmail());
        assertEquals(user.getEmail(), userRegistrationDto.getEmail());

    }

    @Test
    void loadUserByUsername(){
        assertEquals(userService.loadUserByUsername(userRegistrationDto.getEmail()), userRegistrationDto.getEmail());
    }

}