package com.microservices.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication

public class ServiceRegistryApplication {

	public static void main(String[] args) {
		//First GIT Update and Commit.
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
