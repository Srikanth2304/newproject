package com.scb.tradeapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="accounts")
@Entity
public class Account {

	@Id
	private int id;
	private String accountType;
	private Double accountNumber;
	private String accountBranch;
	private Double accountBalance;
	//private long customer_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountBranch() {
		return accountBranch;
	}
	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
