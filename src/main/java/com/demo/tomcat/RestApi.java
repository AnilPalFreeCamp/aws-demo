package com.demo.tomcat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

	@GetMapping("/greeting")
	public String greetings() {
		return "hello";
	}
}
