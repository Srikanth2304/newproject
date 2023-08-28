package com.scb.tradeapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.tradeapi.entity.Customer;
import com.scb.tradeapi.request.CustomerRequest;
import com.scb.tradeapi.response.CustomerResponse;
import com.scb.tradeapi.service.impl.CustomerServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl custService;
	
	@GetMapping("/welcome")
	public String Welcome(){
		return "Welcome to Customer Management";
	}
	
	@PostMapping("/createCustomer")
	public Customer createCustomerWithAccount(@RequestBody CustomerRequest cust) {
		return custService.addCustomerAccount(cust.getCustomer());
	}
	
	@GetMapping("/info")
	public List<Customer> findAll(){
		return custService.getAllCustomerInfo();
	}
	
	
	@GetMapping("/custominfo")
	public List<CustomerResponse> getJoinInfo(){
		return custService.getCustomInfo();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustByID(@PathVariable Long id) {
		return custService.getCustomerById(id);
	}
}
