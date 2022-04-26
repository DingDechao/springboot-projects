package com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.controller;

import com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.constants.RestControllerConstants;
import com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.properties.DdcProperties;
import com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class HelloWorldController {

    @Autowired
    private DdcProperties ddcProperties;

    @GetMapping(RestControllerConstants.HelloWorld.HELLOWORLD)
    public String helloRest() {
        return "hello world";
    }

    @GetMapping(RestControllerConstants.HelloWorld.DDCNAME)
    public String ddcName() {
        return ddcProperties.getName();
    }
    
    @PostMapping(value = RestControllerConstants.HelloWorld.ADDPERSON)
    public Person addPerson(@RequestBody Person person){
        return person;
    }


    @PostMapping(value = RestControllerConstants.HelloWorld.ADDPERSONS)
    public Person[] addPersons(@RequestBody Person[] persons){
        return persons;
    }
}
