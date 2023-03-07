package com.ahuja.springboot.fargate.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class SpringbootFargateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFargateDemoApplication.class, args);
	}
	@GetMapping("/ping")
	public String ping(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s, your mission if you choose to accept, is to print this line!", name);
	}
}
