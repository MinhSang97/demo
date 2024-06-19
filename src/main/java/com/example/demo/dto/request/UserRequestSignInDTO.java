package com.example.demo.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class UserRequestSignInDTO implements Serializable {
    @Email(message = "Email should be valid")
    private String email;
    @NotNull(message = "Phone number is required")
    private String phoneNumber;
    @NotNull(message = "Password is required")
    private String password;

    public UserRequestSignInDTO(String email, String phoneNumber, String password) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }
}
