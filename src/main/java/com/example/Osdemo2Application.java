package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Osdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Osdemo2Application.class, args);
	}
	
	@RequestMapping
	public String ping() {
		return "pong";
	}
}
