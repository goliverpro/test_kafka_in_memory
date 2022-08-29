package com.example.kafkaTest.delivery;

import com.example.kafkaTest.service.MessageGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/message")
public class MessageGeneratorController {

    @Autowired
    private MessageGeneratorService service;

    @PostMapping
    public ResponseEntity<String> postMessage(@RequestBody String message){
        service.sendMessage(message);
        return ResponseEntity.ok().body("Mensagem enviada com sucesso");
    }
}
