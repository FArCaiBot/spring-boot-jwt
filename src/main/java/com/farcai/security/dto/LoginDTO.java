package com.farcai.security.dto;

import com.farcai.security.validators.ValidPassword;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class LoginDTO {

    @Email
    private String email;
    @ValidPassword
    private String password;

}
