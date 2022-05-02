package com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.controller;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setupMockMvc() {
/*        mvc = MockMvcBuilders
                .webAppContextSetup(webApplicationContext)
                .apply(springSecurity())
                .build();*/
    }

    @Test
    public void helloWOrldTest() throws Exception {
        this.mvc.perform(get("/helloworld"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello world"));
    }

    @Test
    public void ddcNameTest() throws Exception {
        this.mvc.perform(get("/ddcname"))
                .andExpect(status().isOk())
                .andExpect(content().string("ddc"));
    }

    @Test
    public void addPersonTest() throws Exception {
        this.mvc.perform(post("/addperson")
                .content("{\"firstName\": \"ddc\"}")
                .contentType("application/json"))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"firstName\":\"ddc\"}"));
    }


    @Test
    public void addPersonsTest() throws Exception {
        this.mvc.perform(post("/addpersons")
                .content("[{\"firstName\": \"ddc1\"},{\"firstName\": \"ddc2\"}]")
                .contentType("application/json"))
                .andExpect(status().isOk())
                .andExpect(content().string("[{\"firstName\":\"ddc1\"},{\"firstName\":\"ddc2\"}]"));
    }
}
