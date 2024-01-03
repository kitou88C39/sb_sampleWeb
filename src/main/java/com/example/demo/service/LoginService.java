package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;

//Loing screen Service
@Service
@RequiredArgsConstructor
public class LoginService {
    // User information table Dao
    private UserInfoRepository repository;

    // User information table key search
    // @param loginId
    // @retrun Search results (1)
    public Optional<UserInfo> searchUserById(String loginId) {
        return repository.findById(loginId);
    }
}