package com.example.demo.form;

import lombok.Data;

//LoginScreen form
@Data
public class LoginForm {

    // LoginId
    private String loginId;
    // Password
    private String password;

    public String getLoginId() {
        return this.loginId;
    }

}
