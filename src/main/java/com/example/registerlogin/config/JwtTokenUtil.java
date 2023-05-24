package com.example.registerlogin.config;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtil {

    public boolean validate(String token) {
        // nothing

        return true;
    }


    public String getUsername(String token) {
        return "giang";
    }
}
