package com.ddc.projects.springboot.springbootmaven.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    @JsonProperty("firstName")
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
