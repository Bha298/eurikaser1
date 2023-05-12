package com.example.departmentservice23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentService23Application {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentService23Application.class, args);
	}

}
