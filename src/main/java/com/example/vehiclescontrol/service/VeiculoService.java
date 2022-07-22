package com.example.vehiclescontrol.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vehiclescontrol.request.VeiculoRequest;
import com.example.vehiclescontrol.response.VeiculoResponse;

@Service
public interface VeiculoService {

	public VeiculoResponse cadastroVeiculo(VeiculoRequest veiculoRequest);

	public List<VeiculoResponse> listaTodosVeiculos();
	
	public VeiculoResponse listarVeiculoPorId(Long id);
	
	public VeiculoResponse atualizarVeiculo(Long id, VeiculoRequest veiculoRequest);
	
	public void deletarVeiculo(Long id);
	
	public List<VeiculoResponse> listarVeiculosFiltrados(String marca, Integer ano);
	
}
