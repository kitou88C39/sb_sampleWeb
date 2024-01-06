package com.example.demo.form;

import java.util.Optional;

import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserInfoRepository;

//User registration screen

public class SignupService {

    private final UserInfoRepository repository;

    public UserInfo resistUserById(SignupForm form) {
        var userInfo = new UserInfo();
        userInfo.setLoginId(form.getLoginId());
        userInfo.setPassword(form.getPassword());
        return repository.save(userInfo);
    }

}