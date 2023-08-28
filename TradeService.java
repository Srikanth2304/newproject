package com.scb.tradeapi.service;
import java.util.List;


import com.scb.tradeapi.entity.Trade;
import com.scb.tradeapi.response.CustomTradeDetail;
import com.scb.tradeapi.response.GeneralResponse;


public interface TradeService {
	public List<Trade> getAllTrade();
	public GeneralResponse handleOutboundStatus(long tradeId,String newStatus,String message);
	public GeneralResponse handleMakersConfirmation(long tradeId, String newStatus, String message);
	public GeneralResponse handleCheckersConfirmation(long tradeId, String newStatus, String message);
	public Trade getTradeById(long tradeId);
}





