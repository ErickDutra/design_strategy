package com.design.pattern.strategy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.pattern.strategy.dto.ViagemDto;
import com.design.pattern.strategy.service.ViagemService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@CrossOrigin("*")
@RequestMapping("/viagem")
public class ViagemController {

    @Autowired
    private ViagemService viagemService;

    @PostMapping("/agendar")
    public void agendarViagemDto(@RequestBody ViagemDto viagemDto) { 
        viagemService.notfyViagem(viagemDto);
    }
    
}
