package com.scb.tradeapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="users")
@Entity

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userID;
	private String name;
	private String accountType;//saving,current
	private String accountNumber;
	
}
