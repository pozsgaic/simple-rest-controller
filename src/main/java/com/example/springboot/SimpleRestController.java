package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class SimpleRestController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/status")
	public String status() {
		return "OK";
	}

	@PutMapping("/publish/{id}")
	public String publish(@PathVariable("id") String msg, @RequestBody PublishObject pubObject) {
		System.out.println("Published " + pubObject.message);
		return "Published: " + pubObject;
	}

}
