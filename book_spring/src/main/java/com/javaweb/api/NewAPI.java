package com.javaweb.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewAPI {
	@GetMapping("/test")
	public String testAPI(@RequestParam(value = "name", required = false) String name) {
		return "successfuly " + name;
	}
}