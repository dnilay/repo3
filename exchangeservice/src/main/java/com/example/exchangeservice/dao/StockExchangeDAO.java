package com.example.exchangeservice.dao;

import com.example.exchangeservice.model.StockExchange;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockExchangeDAO extends CrudRepository<StockExchange, Integer>{

}
