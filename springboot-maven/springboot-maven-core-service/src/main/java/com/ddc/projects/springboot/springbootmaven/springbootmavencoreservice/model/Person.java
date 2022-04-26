package com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Person {

    private String id;

    @JsonProperty("firstName")
    @TableField("firstName")
    private String firstName;

    @TableField("lastName")
    private String lastName;

}
