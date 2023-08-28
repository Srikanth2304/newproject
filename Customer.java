package com.scb.tradeapi.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="customers")
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private Boolean active;
	
	@OneToMany(targetEntity = Account.class, cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id" , referencedColumnName = "id")
	private List<Account> accounts;

	

}
