package com.design.pattern.strategy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.design.pattern.strategy.tables.Viagem;

public interface ViagemRepository extends JpaRepository<Viagem, Long>{
    
}
