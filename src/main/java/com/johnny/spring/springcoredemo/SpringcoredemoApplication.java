package com.johnny.spring.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication is composed of the following annotations:
 * @EnableAutoConfiguration - Enables Spring Boot's auto-configuration
 * suppoort
 * @ComponentScan - Enables component scanning of current package.
 * Also recursively scans sub-packages
 * @Configuration - Able to regist extra beans with @Bean or import
 * other configuration classes
 */
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
