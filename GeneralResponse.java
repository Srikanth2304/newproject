package com.scb.tradeapi.response;

import lombok.Data;

@Data
public class GeneralResponse {
	private String message;
	private String status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public GeneralResponse(String message, String status) {
		super();
		this.message = message;
		this.status = status;
	}
}
