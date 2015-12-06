package com.tmon.sb.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmon.sb.demo.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	DemoService demoService;
	
	@RequestMapping("/home")
	public String home() {
		return demoService.getHomeMessage();
	}
}