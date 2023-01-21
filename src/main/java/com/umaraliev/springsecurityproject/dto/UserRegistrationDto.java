package com.umaraliev.springsecurityproject.dto;

import com.umaraliev.springsecurityproject.model.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserRegistrationDto {

    private String email;
    private String password;
    public List<Role> roles;
}
