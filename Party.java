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
@Table(name="partys")
@Entity

public class Party {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long fmid;
	private String partyName;
	
	//Adress object
	private String partyCountry;//saving,current
	private String postalCode;
	private String currency;
	
	private double currencyValue;
	
	
}
