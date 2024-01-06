package com.example.demo.form;

import java.util.Optional;

import com.example.demo.repository.UserInfoRepository;

//LoginScreen Service

public class SignupService {

    private final UserInfoRepository repository;

    public Optional<UserInfo> searchUserById(String loginId) {
        return repository.findById(loginId);
    }

}