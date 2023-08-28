package com.scb.tradeapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.tradeapi.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

}
