package com.scb.tradeapi.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.tradeapi.dao.TradeRepository;
import com.scb.tradeapi.entity.Trade;
import com.scb.tradeapi.exception.ResourceNotFoundException;
import com.scb.tradeapi.response.CustomTradeDetail;
import com.scb.tradeapi.response.GeneralResponse;
import com.scb.tradeapi.service.TradeService;

@Service
public class TradeServiceImpl implements TradeService{
	@Autowired
	private  TradeRepository tradeRepo;

	@Override
	public List<Trade> getAllTrade() {
		return tradeRepo.findAll();
	}
	
	@Override
	public Trade getTradeById(long tradeId) {
		Trade thistrade = tradeRepo
				.findById(tradeId)
				.orElseThrow(()->new ResourceNotFoundException("Trade Not found with id"+tradeId));
		return thistrade;
	}

	@Override
	public GeneralResponse handleOutboundStatus(long tradeId, String newStatus, String message) {
		Trade thistrade = tradeRepo
				.findById(tradeId)
				.orElseThrow(()->new ResourceNotFoundException("Trade Not found with id"+tradeId));
		
		if(newStatus.equals("Rejected")) {
			thistrade.setStatus(newStatus);
			thistrade.setOutboundComment(message);
		}
		else if(newStatus.equals("Outbound Sent")){
			thistrade.setStatus(newStatus);
			thistrade.setOutboundComment(message);
		}
		
		tradeRepo.save(thistrade);
		return new GeneralResponse("Sucessfully updated data","true");
	}

	@Override
	public GeneralResponse handleMakersConfirmation(long tradeId, String newStatus, String message) {
		Trade thistrade = tradeRepo
				.findById(tradeId)
				.orElseThrow(()->new ResourceNotFoundException("Trade Not found with id"+tradeId));
		
		if(newStatus.equals("Rejected")) {
			thistrade.setStatus(newStatus);
			thistrade.setInboundComment1(message);
		}
		else if(newStatus.equals("Makers Confirmed")){
			thistrade.setStatus(newStatus);
			thistrade.setInboundComment1(message);
		}
		
		tradeRepo.save(thistrade);
		return new GeneralResponse("Sucessfully updated data","true");
	}

	@Override
	public GeneralResponse handleCheckersConfirmation(long tradeId, String newStatus, String message) {
		Trade thistrade = tradeRepo
				.findById(tradeId)
				.orElseThrow(()->new ResourceNotFoundException("Trade Not found with id"+tradeId));
		
		if(newStatus.equals("Rejected")) {
			thistrade.setStatus(newStatus);
			thistrade.setInboundComment2(message);
		}
		else if(newStatus.equals("Checkers confirmed")){
			thistrade.setStatus(newStatus);
			thistrade.setInboundComment2(message);
		}
		
		tradeRepo.save(thistrade);
		return new GeneralResponse("Sucessfully updated data","true");
	}
	
}
