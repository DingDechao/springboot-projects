package com.ddc.projects.springboot.springbootmaven.controller;

import com.ddc.projects.springboot.springbootmaven.model.Person;
import com.ddc.projects.springboot.springbootmaven.properties.DdcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.print.attribute.standard.Media;


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
    
    @PostMapping(value="addperson")
    public Person addPerson(@RequestBody Person person){
        return person;
    }


    @PostMapping(value="addpersons")
    public Person[] addPersons(@RequestBody Person[] persons){
        return persons;
    }
    
}
