package com.honda.ccsportal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Predicates;

import io.swagger.annotations.ApiModelProperty;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication//(scanBasePackages={
//"com.honda.ccsportal.something", "com.honda.ccsportal.CcsportalApplication"})
@EnableJpaRepositories("com.honda.ccsportal.repository")
@EnableSwagger2
@RestController

public class CcsportalApplication extends SpringBootServletInitializer{

	@ApiModelProperty(required = false, hidden = true)
	private String internallyUsedProperty;

	private static final Logger LOG = LoggerFactory.getLogger(CcsportalApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CcsportalApplication.class);
	}
	
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
