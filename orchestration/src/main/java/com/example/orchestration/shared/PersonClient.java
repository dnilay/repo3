package com.example.orchestration.shared;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("person-service")
public interface PersonClient {
    @RequestMapping("/persons")
    public void getAllPerson();
}
