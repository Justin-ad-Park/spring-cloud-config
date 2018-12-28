package com.justin.csclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * How to test
 * 	http://localhost:8094/config/static
 * 	http://localhost:8094/config/dynamic
 *
 * After changing configuration(*.yml)
 * you need to call refresh url as below.
 *
 * 	http://localhost:8081/actuator/refresh method : post
 */
@ComponentScan(basePackages = {"com.justin"})
@SpringBootApplication
public class CsclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsclientApplication.class, args);
	}

}

