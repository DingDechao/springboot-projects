package com.ddc.projects.springboot.springbootmaven.controller;

import com.ddc.projects.springboot.springbootmaven.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/asyncMethodTest")
    public void asyncMethodTest() throws Exception{
        System.out.println("asyncMethodTest is started");
        asyncService.asyncMethod();
        System.out.println("asyncMethodTest is ended");
    }
}
