package com.honda.ccsportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.google.common.base.Predicates;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
@EnableJpaRepositories("com.honda.ccsportal.repository")

public class CcsportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcsportalApplication.class, args);
	}
    
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.honda.ccsportal.controller"))
				.apis(Predicates.not(RequestHandlerSelectors.basePackage("com.honda.ccsportal.entity"))).build();
	}
	
}
