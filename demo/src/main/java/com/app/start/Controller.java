package com.app.start;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Controller {

	@GetMapping("/get")
	public String get() {
		String value = "Welcome to get Service";
		System.out.print(value);
		return value;
	}
}
