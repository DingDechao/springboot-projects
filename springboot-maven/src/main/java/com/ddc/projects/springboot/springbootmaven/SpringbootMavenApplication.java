package com.ddc.projects.springboot.springbootmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
1. 启动引导类
2. 配置类
*/

/*
@SpringBootApplicatio
开启组件扫描和自动配置
实际上包含3个注解
1. @Configuration - 该类使用spring基于java的配置
2. @ComponentScan - 启用组建扫描
3. @EnableAutoConfiguration - 开启spring boot的自动配置



*/

@SpringBootApplication
public class SpringbootMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMavenApplication.class, args);
	}

}
