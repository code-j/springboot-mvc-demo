package com.tmon.sb.demo.service;

import org.springframework.stereotype.Service;

import com.tmon.sb.demo.domain.Customer;

@Service
public class DemoService {

	public Customer getHomeMessage() {
		return new Customer("2015120704", "DemoTester");
	}
	
}
