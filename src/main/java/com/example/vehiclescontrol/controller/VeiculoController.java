package com.example.vehiclescontrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehiclescontrol.request.VeiculoRequest;
import com.example.vehiclescontrol.response.VeiculoResponse;
import com.example.vehiclescontrol.service.VeiculoService;

@RestController
@RequestMapping(value = "veiculos")
public class VeiculoController {

	@Autowired
	VeiculoService veiculoService;
	
	@PostMapping()
	public VeiculoResponse cadastrarVeiculo(@RequestBody VeiculoRequest veiculoRequest) {
		return veiculoService.cadastroVeiculo(veiculoRequest);
	}
	
	@GetMapping()
	public List<VeiculoResponse> listarTodosVeiculos(){
		return veiculoService.listaTodosVeiculos();
	}
	
	@GetMapping(value = "/{id_veiculo}")
	public VeiculoResponse listarVeiculo(@PathVariable("id_veiculo") Long id) {
		return veiculoService.listarVeiculoPorId(id);
	}
	
	@PutMapping(value = "/{id_veiculo}")
	public VeiculoResponse atualizarVeiculo(@PathVariable("id_veiculo") Long id, @RequestBody VeiculoRequest veiculoRequest) {
		return veiculoService.atualizarVeiculo(id, veiculoRequest);
	}
	
	@DeleteMapping(value = "/{id_veiculo}")
	public void deletarVeiculo(@PathVariable("id_veiculo") Long id) {
		veiculoService.deletarVeiculo(id);
	}
	
	@GetMapping(value = "/filtro")
	public List<VeiculoResponse> listarVeiculoFiltrado(
			@RequestParam(value = "marca", required = false) String marca,
			@RequestParam(value = "ano", required = false) Integer ano){
		
		return veiculoService.listarVeiculosFiltrados(marca, ano);
	}
	
}
