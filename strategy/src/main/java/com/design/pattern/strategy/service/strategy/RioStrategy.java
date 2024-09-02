package com.design.pattern.strategy.service.strategy;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import com.design.pattern.strategy.service.DistanciaStrategy;
import com.design.pattern.strategy.service.ViagemService;

public class RioStrategy implements DistanciaStrategy {
    private final Logger logger = LoggerFactory.getLogger(ViagemService.class);

    @Override
    public void calcularDistancia(String destino, Double distancia) {
        logger.info("A distancia da sua viagem de Santa Catarina para [{}] que e de [{}] km", destino, distancia );
    }
    
}
