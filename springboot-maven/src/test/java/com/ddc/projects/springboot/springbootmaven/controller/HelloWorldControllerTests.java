package com.ddc.projects.springboot.springbootmaven.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTests {

    @Autowired
    private MockMvc mvc;

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
}
