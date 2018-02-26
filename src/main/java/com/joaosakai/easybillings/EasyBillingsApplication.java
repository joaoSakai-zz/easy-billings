package com.joaosakai.easybillings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EasyBillingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyBillingsApplication.class, args);
	}
}
