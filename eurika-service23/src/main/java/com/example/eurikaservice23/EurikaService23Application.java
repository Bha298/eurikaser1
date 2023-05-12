package com.example.eurikaservice23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurikaService23Application {

	public static void main(String[] args) {
		SpringApplication.run(EurikaService23Application.class, args);
	}

}
