package com.ddc.projects.springboot.springbootmaven.controller;

import com.ddc.projects.springboot.springbootmaven.properties.DdcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private DdcProperties ddcProperties;

    @GetMapping("/helloworld")
    public String helloRest() {
        return "hello world";
    }

    @GetMapping("/ddcname")
    public String ddcName() {
        return ddcProperties.getName();
    }
}
