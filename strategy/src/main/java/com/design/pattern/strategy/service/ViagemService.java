package com.design.pattern.strategy.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.design.pattern.strategy.dto.ViagemDto;
import com.design.pattern.strategy.service.strategy.BrasiliaStrategy;
import com.design.pattern.strategy.service.strategy.RioStrategy;
import com.design.pattern.strategy.service.strategy.SaoPauloStrategy;

@Service
public class ViagemService {
    private final Map<String, DistanciaStrategy> mapStrategy = Map.of(
      "Brasilia", new SaoPauloStrategy(),
        "São Paulo",  new RioStrategy() ,
        "Rio de Janeiro", new BrasiliaStrategy()  
    );

    public void notfyViagem(ViagemDto viagemDto){
        
        mapStrategy.get(viagemDto.destino()).calcularDistancia(viagemDto.destino(), viagemDto.distancia());
      
    }
}
