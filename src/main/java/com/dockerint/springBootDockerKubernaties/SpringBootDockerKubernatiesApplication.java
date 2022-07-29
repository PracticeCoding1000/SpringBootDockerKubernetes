package com.dockerint.springBootDockerKubernaties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDockerKubernatiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerKubernatiesApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

}
