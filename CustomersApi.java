package com.scb.tradeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableWebMvc

@EnableSwagger2
@SpringBootApplication
public class CustomersApi {

	public static void main(String[] args) {
		SpringApplication.run(CustomersApi.class, args);

	}
