package com.revature;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("")
public class Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	// Sets to environment variable MY_ENV or unset if the environment variable is not defined
	@Value("${MY_ENV:unset}")
	private String myEnv;
	
	@GetMapping("")
	public String sayHello() {
		return "Hello world!";
	}
	
	@GetMapping("env")
	public String showEnv() {
		return "Environment value: " + myEnv;
	}
}
