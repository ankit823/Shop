package com.shopLocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@Configuration
@ComponentScan({"controller","service"})
public class ShopeeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopeeServerApplication.class, args);
	}
}
