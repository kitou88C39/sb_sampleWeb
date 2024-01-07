package com.example.demo.service;

import dozer.DozerBeanMapper;

import org.apache.catalina.mapper.Mapper;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.password.PasswordEncoder;
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
    // passwordEncoder
    private final PasswordEncoder passwordEncoder;

    public UserInfo resistUserById(SignupForm form) {
        var userInfo = mapper.map(form, UserInfo.class);

        var encodedPassword = passwordEncoder.encode(form.getPassword());
        userInfo.setPassword(encodedPassword);

        return repository.save(userInfo);
    }
}