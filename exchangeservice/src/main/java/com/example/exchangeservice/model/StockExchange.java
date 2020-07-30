package com.example.exchangeservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockExchange {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private String brief;
	private String contactAddress;
	private String Remarks;
	
	
}
