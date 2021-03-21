package com.example.vueblog.common.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "Username cannot be null!!")
    private String username;

    @NotBlank(message = "Password cannot be null!!")
    private String password;
}
