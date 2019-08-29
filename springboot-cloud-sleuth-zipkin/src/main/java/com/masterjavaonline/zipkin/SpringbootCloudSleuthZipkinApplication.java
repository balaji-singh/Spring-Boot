package com.masterjavaonline.zipkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringbootCloudSleuthZipkinApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringbootCloudSleuthZipkinApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudSleuthZipkinApplication.class, args);
	}

	@Autowired
	private RestTemplate template;

	@GetMapping("/home")
	public String discount() {
		log.info("home service called....");
		return "Home page Displayed";
	}

	@GetMapping("/login")
	public String payment() {
		log.info("Login service called with home....");
		return template.getForObject("http://localhost:8080/home", String.class);
	}
}
