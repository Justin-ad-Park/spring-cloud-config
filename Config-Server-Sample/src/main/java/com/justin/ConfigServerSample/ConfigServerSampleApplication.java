package com.justin.ConfigServerSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 http://localhost:8080/csclient/dev
 http://localhost:8080/csclient/beta
 http://localhost:8080/csclient/real
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerSampleApplication.class, args);
	}

}

