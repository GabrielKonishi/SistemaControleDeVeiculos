package com.example.vehiclescontrol.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.vehiclescontrol.entity.VeiculoEntity;

@Repository
public interface CustomVeiculoRepository {

	public List<VeiculoEntity> buscarVeiculosFiltrados(String marca, Integer ano);
}
