package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication
//(exclude = {SpringBootHolaMundoApplication.class, WebMvcAutoConfiguration.class})
public class SpringBootHolaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHolaMundoApplication.class, args);
//		 SpringApplication app = new SpringApplication(SpringBootHolaMundoApplication.class);
//	        app.setDefaultProperties(Collections
//	          .singletonMap("server.port", "8083"));
//	        app.run(args);
		
	}

}
