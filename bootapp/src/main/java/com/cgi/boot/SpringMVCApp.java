package com.cgi.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages={"com.cgi.controllers"})
@SpringBootApplication
public class SpringMVCApp {

	public static void main(String n[]){
		SpringApplication.run(SpringMVCApp.class, n);
	}
}
