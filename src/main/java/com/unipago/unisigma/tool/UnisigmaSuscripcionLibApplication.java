package com.unipago.unisigma.tool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class UnisigmaSuscripcionLibApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnisigmaSuscripcionLibApplication.class, args);
	}

}
