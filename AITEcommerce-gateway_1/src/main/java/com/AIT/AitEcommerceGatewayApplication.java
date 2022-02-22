package com.AIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AitEcommerceGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AitEcommerceGatewayApplication.class, args);
	}

}
