package com.yyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8003_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DeptProvider8003_App.class, args);
	}

}
