package com.example.SpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		System.out.println("test");
		SpringApplication.run(SpringProjectApplication.class, args);
	}

}

