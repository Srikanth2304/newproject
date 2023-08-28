package com.scb.tradeapi.service;

import java.util.List;
import java.util.Optional;

import com.scb.tradeapi.entity.Customer;
import com.scb.tradeapi.response.CustomerResponse;

public interface CustomerService {
	
	public Customer addCustomerAccount(Customer cust);
	public List<Customer> getAllCustomerInfo();
	public List<CustomerResponse> getCustomInfo();
	public Customer getCustomerById(long custId);
	
}
