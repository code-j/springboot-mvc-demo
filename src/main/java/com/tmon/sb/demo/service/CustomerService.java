package com.tmon.sb.demo.service;

import org.springframework.stereotype.Service;

import com.tmon.sb.demo.domain.Customer;

@Service
public class CustomerService {
	
	public Customer getCustomer(Integer id){
		return new Customer(id, "customer"+id);
	}
}
