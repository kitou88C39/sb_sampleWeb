package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//User information table Entity

@Entity
@Table(name = "user_info")
@Data
public class UserInfo {

    // LoginID
    @Id
    @Column(name = "login_id")
    private String loginId;
    // password
    private String password;

}