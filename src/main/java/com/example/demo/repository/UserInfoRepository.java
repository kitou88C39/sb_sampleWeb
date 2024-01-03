package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserInfo;

//User information table Dao
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

}