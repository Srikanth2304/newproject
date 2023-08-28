package com.scb.tradeapi.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.scb.tradeapi.entity.Trade;
import com.scb.tradeapi.response.CustomTradeDetail;

@Repository
public interface TradeRepository extends JpaRepository<Trade,Long>{
	
}
