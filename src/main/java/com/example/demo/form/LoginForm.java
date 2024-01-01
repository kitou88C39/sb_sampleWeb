package com.example.demo.form;

import org.springframework.stereotype.Controller;
import lombok.Data;

@Data
public class LoginForm {

    private String loginId;
    private String password;

    public String getLoginId() {
        return this.loginId;
    }

    }

    

    

    
    