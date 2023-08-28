package com.scb.tradeapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.scb.tradeapi.entity.Customer;
import com.scb.tradeapi.response.CustomerResponse;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
	@Query("SELECT new com.scb.tradeapi.response.CustomerResponse(id,fname,lname,email,phone,active) from Customer")
	public List<CustomerResponse> getJoinInfo();

}
