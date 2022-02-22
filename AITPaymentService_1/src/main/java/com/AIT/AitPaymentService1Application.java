package com.AIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AitPaymentService1Application {

	public static void main(String[] args) {
		SpringApplication.run(AitPaymentService1Application.class, args);
	}

}
