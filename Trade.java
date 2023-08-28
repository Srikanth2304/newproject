package com.scb.tradeapi.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="trades")
@Entity

public class Trade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long tradeRef;
	private String executionDateTime;
	private String productType;
	private double paymentAmountUSD;
	private String settleType;
	// user
	@OneToOne(targetEntity = User.class, cascade=CascadeType.ALL)
	@JoinColumn(name="routingId" , referencedColumnName = "userID")
	private User user;
	// fmid
	@OneToOne(targetEntity = Party.class, cascade=CascadeType.ALL)
	@JoinColumn(name="p1" , referencedColumnName = "fmid")
	private Party party1;
	// fmid
	@OneToOne(targetEntity = Party.class, cascade=CascadeType.ALL)
	@JoinColumn(name="p2" , referencedColumnName = "fmid")
	private Party party2;
	private long makerID;
	private long checkerID;
	private String status;
	private String makersAction;
	private String checkersAction;
	private String outboundComment;
	private String inboundComment1;
	private String inboundComment2;
	private String pdfUrl;
	
	
	// getters and setters
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOutboundComment() {
		return outboundComment;
	}
	public void setOutboundComment(String outboundComment) {
		this.outboundComment = outboundComment;
	}
	public String getInboundComment1() {
		return inboundComment1;
	}
	public void setInboundComment1(String inboundComment1) {
		this.inboundComment1 = inboundComment1;
	}
	public String getInboundComment2() {
		return inboundComment2;
	}
	public void setInboundComment2(String inboundComment2) {
		this.inboundComment2 = inboundComment2;
	}
}
