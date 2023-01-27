package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	  public OpenAPI openAPI(@Value("${springdoc.version}") String springdocVersion) {
	    Info info = new Info()
	        .title("Dog Market API")
	        .version(springdocVersion)
	        .description("Dog Market API입니다.");

	    return new OpenAPI()
	        .components(new Components())
	        .info(info);
	  }
	
	
	
	
	
}
