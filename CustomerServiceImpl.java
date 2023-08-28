package com.scb.tradeapi.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.tradeapi.dao.CustomerRepository;
import com.scb.tradeapi.entity.Customer;
import com.scb.tradeapi.exception.ResourceNotFoundException;
import com.scb.tradeapi.response.CustomerResponse;
import com.scb.tradeapi.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository custRepo;
	
	@Override
	public Customer addCustomerAccount(Customer cust) {
		return custRepo.save(cust);	
	}

	@Override
	public List<Customer> getAllCustomerInfo() {
		return custRepo.findAll();
	}

	@Override
	public Customer getCustomerById(long custId) {
		return custRepo
				.findById(custId)
				.orElseThrow(()->new ResourceNotFoundException("Customer Not found with id"+custId));
	}

	@Override
	public List<CustomerResponse> getCustomInfo() {
		return custRepo.getJoinInfo();
	}
	
}
