package com.ddc.projects.springboot.springbootmaven.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncService {

    @Async
    public void asyncMethod() throws Exception{
        Thread.sleep(5000);
        System.out.println("This is for testing asyncMethod");
    }
}
