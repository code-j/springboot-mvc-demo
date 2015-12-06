package com.tmon.sb.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public String getHomeMessage() {
		return new String("Welcome, Home");
	}
	
}
