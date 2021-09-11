package com.ch01.tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TacosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacosApplication.class, args);
	}
	// @GetMapping("/test")
	// public String test() {
	// 	return "test";
	// }
}
