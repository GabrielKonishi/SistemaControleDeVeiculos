package com.example.vehiclescontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehiclescontrol.entity.VeiculoEntity;

public interface VeiculoRepository extends JpaRepository<VeiculoEntity, Long>{

	
}
