package com.tmon.sb.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmon.sb.demo.domain.Customer;
import com.tmon.sb.demo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class DemoApiController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable Integer id) {
		return customerService.getCustomer(id);
	}
}
