package com.tutorials.spring_boot_docker_image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerImageApplication {
	
	@GetMapping("/google-jib")
	public String runImage() {
		return "Dockerize java application using Google Jib!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerImageApplication.class, args);
	}

}
