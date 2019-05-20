package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignPostsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignPostsApplication.class, args);
	}

}
