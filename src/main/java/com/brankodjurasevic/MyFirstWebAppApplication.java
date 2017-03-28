package com.brankodjurasevic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MyFirstWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebAppApplication.class, args);
	}
}
