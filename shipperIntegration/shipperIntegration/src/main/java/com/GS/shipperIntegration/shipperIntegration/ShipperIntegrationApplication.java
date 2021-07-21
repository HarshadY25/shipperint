package com.GS.shipperIntegration.shipperIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.GS.shipperIntegration.Controller",
		"com.GS.shipperIntegration.Models",
		"com.GS.shipperIntegration.Service",
		"com.GS.shipperIntegration.EntityModels"})
//@EntityScan("com.Growsimplee.EntityModels")
public class ShipperIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShipperIntegrationApplication.class, args);
	}

//	@Bean
//	public RestTemplate getRestTemplate() {
//
//		ClientHttpRequestFactory requestFactory = new
//				HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
//
//		RestTemplate restTemplate = new RestTemplate(requestFactory);
//		return restTemplate;
//
//	}
}
