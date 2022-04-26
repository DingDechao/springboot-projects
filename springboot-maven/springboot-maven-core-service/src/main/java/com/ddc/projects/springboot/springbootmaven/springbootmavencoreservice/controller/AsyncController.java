package com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.controller;

import com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.constants.RestControllerConstants;
import com.ddc.projects.springboot.springbootmaven.springbootmavencoreservice.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping(RestControllerConstants.AsyncController.ASYNCMETHODTEST)
    public void asyncMethodTest() throws Exception{
        System.out.println("asyncMethodTest is started");
        asyncService.asyncMethod();
        System.out.println("asyncMethodTest is ended");
    }
}
