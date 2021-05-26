package com.hibernate.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2Example1Application {

	public static void main(String[] args) {
		try{
			SpringApplication.run(H2Example1Application.class, args);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
