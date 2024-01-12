package com.thorabh.shoply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShoplyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoplyApplication.class, args);
	}
	
}
