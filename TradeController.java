package com.scb.tradeapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.tradeapi.entity.Customer;
import com.scb.tradeapi.entity.Trade;
import com.scb.tradeapi.request.CustomerRequest;
import com.scb.tradeapi.response.CustomTradeDetail;
import com.scb.tradeapi.response.GeneralResponse;
import com.scb.tradeapi.service.TradeService;

@RestController
@RequestMapping("/api")
public class TradeController {
	@Autowired
	private TradeService tradeService;
	
	@GetMapping("/trade/all")
	public List<Trade> ListAllTrade(){
		return tradeService.getAllTrade();
	}
	
	@GetMapping("/trade/id")
	public Trade TradeById(long tradeId){
		return tradeService.getTradeById(tradeId);
	}
	
	@PostMapping("trade/outboundConfirmation")
	public GeneralResponse outboundConfirmation(long tradeId,String newStatus,String message) {
		return tradeService.handleOutboundStatus(tradeId,newStatus,message);
	}
	
	@PostMapping("trade/makersConfirmation")
	public GeneralResponse makersConfirmation(long tradeId,String newStatus,String message) {
		return tradeService.handleMakersConfirmation(tradeId,newStatus,message);
	}
	
	@PostMapping("trade/checkersConfirmation")
	public GeneralResponse checkersConfirmation(long tradeId,String newStatus,String message) {
		return tradeService.handleCheckersConfirmation(tradeId,newStatus,message);
	}

}
