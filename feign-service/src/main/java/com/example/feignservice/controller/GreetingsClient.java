package com.example.feignservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("greeting-service")
public interface GreetingsClient {
	@GetMapping(value= "/getGreetings/{localeId}")
	public String getGreetings(@PathVariable(name= "localeId") String langCode);
}