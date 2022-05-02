package com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.entity;

import lombok.Data;

@Data
public class User {

    private String id;
    private String name;
    private String age;
    private String email;
    private String managerId;
    private String createTime;

}
