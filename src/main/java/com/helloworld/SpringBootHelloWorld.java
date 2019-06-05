package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.helloworld.controller.TestController;

@SpringBootApplication
@ComponentScan(basePackageClasses=TestController.class)
public class SpringBootHelloWorld {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorld.class, args);
	}
}
