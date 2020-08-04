package com.example.orchestration;

import com.example.orchestration.shared.PersonClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class ClientController {

    private PersonClient personClient;

    public ClientController(PersonClient personClient) {
        this.personClient = personClient;
    }

    @RequestMapping("/")
    public ResponseEntity getAllPerson()
    {
        personClient.getAllPerson();
        return  null;
    }

}
