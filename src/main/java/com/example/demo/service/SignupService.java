package com.example.demo.service;

import dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;
import com.example.demo.form.SignupForm;
import com.example.demo.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;

//User registration screen

public class SignupService {

    private final UserInfoRepository repository;
    // Dozer Mapper
    private final Mapper mapper;

    public UserInfo resistUserById(SignupForm form) {
        var mapper = new DozerBeanMapper();
        var userInfo = new UserInfo();
        userInfo.setLoginId(form.getLoginId());
        userInfo.setPassword(form.getPassword());

        return repository.save(userInfo);
    }
}