package com.tmon.sb.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/home")
	public String home() {
		return "Welcome, Home";
	}
}