package com.hendisantika.orderservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceApplication.class);

	public static void main(String[] args) {
        LOGGER.debug("The order service is running .................");
        SpringApplication.run(OrderServiceApplication.class, args);
	}
}
