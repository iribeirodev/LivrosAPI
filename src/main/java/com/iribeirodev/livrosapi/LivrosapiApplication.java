package com.iribeirodev.livrosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.iribeirodevmodel.livrosapi.model"})
public class LivrosapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrosapiApplication.class, args);
	}
}
