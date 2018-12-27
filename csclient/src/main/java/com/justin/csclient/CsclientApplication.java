package com.justin.csclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.justin"})
@SpringBootApplication
public class CsclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsclientApplication.class, args);
	}

}

