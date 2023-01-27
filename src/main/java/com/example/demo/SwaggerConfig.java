package com.example.demo;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder()
							 .group("v1-definition")
							 .pathsToMatch("/dog-market/**")
							 .build();
	}
	
	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
							.info(new Info().title("Dog Market API")
											.description("Dog Market API 명세서입니다.")
											.version("v0.0.1"));
	}
}
