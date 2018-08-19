package io.javabrains.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@tells that this is the start of our spring boot application
@EnableAutoConfiguration
public class CourseApiApp {

	// This is the main class where we are going to bootstrap the spring boot application
	// This starts/creates the servlet container and hosts the application
	public static void main(String[] args) {
		
		SpringApplication.run(CourseApiApp.class, args);
		
	}

}
