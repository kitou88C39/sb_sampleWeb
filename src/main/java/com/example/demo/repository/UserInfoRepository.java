package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserInfo;

//User information table Dao
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

}