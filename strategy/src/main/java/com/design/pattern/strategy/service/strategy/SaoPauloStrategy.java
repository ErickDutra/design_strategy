package com.design.pattern.strategy.service.strategy;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import com.design.pattern.strategy.service.DistanciaStrategy;
import com.design.pattern.strategy.service.ViagemService;

public class SaoPauloStrategy implements DistanciaStrategy {
    private final Logger logger = LoggerFactory.getLogger(ViagemService.class);

    @Override
    public void calcularDistancia(String destino, Double distancia) {
        logger.info("A distancia da sua viagem de Sao Paulo para [{}] que e de [{}] km", destino, distancia );
    }
    
}
