package com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {

    // mp 自动找id， 如果不是id需要主动申明主键
    // @TableId
    private Long id;
    //@TableField("mp_name")
    private String name;
    private String age;
    private String email;
    private String managerId;
    private String createTime;
    // 数据库没有对应的字段
    // 1. transient 但是不参与序列化
    // 2. static 但是是类级不好
    // 3. @TableField(exist = false)
    @TableField(exist = false)
    private String remark;

}
