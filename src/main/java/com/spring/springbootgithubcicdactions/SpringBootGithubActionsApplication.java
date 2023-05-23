package com.spring.springbootgithubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGithubActionsApplication {

	@GetMapping("/demo")
	public String demo() {
		return "Test successful";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGithubActionsApplication.class, args);
	}

}
