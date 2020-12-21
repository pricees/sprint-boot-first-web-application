package com.in28minutes.springboot.web.sprintbootfirstwebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.springboot.web.controller.LoginController;

@SpringBootApplication
@ComponentScan(basePackageClasses = LoginController.class)
public class SprintBootFirstWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootFirstWebApplication.class, args);
	}

}
