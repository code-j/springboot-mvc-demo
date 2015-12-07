package com.tmon.sb.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DemoController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "Spring Boot Demo");
		return "home";
	}
}