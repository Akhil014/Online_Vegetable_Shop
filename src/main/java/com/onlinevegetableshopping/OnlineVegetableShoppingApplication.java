package com.onlinevegetableshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//@ComponentScan(basePackages = "com.onlinevegetableshopping")
public class OnlineVegetableShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineVegetableShoppingApplication.class, args);
		System.out.println("Online_Vegetable_Shopping is Successfully created");
	}
	
	//Bean
	@Bean
	public Docket productApi() {
	return new Docket(DocumentationType.SWAGGER_2).select()
	.apis(RequestHandlerSelectors.basePackage("com")).build();
	}
}
