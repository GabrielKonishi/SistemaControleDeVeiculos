package com.example.vehiclescontrol.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehiclescontrol.entity.VeiculoEntity;
import com.example.vehiclescontrol.repository.CustomVeiculoRepository;
import com.example.vehiclescontrol.repository.VeiculoRepository;
import com.example.vehiclescontrol.request.VeiculoRequest;
import com.example.vehiclescontrol.response.VeiculoResponse;
import com.example.vehiclescontrol.service.VeiculoService;

@Service
public class VeiculoServiceImpl implements VeiculoService{

	@Autowired
	VeiculoRepository veiculoRepository;
	
	@Autowired
	CustomVeiculoRepository customVeiculoRepository;

	@Override
	public VeiculoResponse cadastroVeiculo(VeiculoRequest request) { 
		VeiculoEntity veiculoEntity = requestToEntity(request);
		veiculoRepository.save(veiculoEntity);
		
		return entityToResponse(veiculoEntity);
	}

	private VeiculoResponse entityToResponse(VeiculoEntity veiculoEntity) {
		VeiculoResponse veiculoResponse = new VeiculoResponse();
		veiculoResponse.setVeiculo(veiculoEntity.getVeiculo());
		veiculoResponse.setMarca(veiculoEntity.getMarca());
		veiculoResponse.setAno(veiculoEntity.getAno());
		veiculoResponse.setDescricao(veiculoEntity.getDescricao());
		veiculoResponse.setDisponibilidade(veiculoEntity.getDisponibilidade());
		veiculoResponse.setDataCadastro(veiculoEntity.getDataCadastro());
		veiculoResponse.setDataAtualizacao(veiculoEntity.getDataAtualizacao());
		return veiculoResponse;
	}

	private VeiculoEntity requestToEntity(VeiculoRequest request) {
		VeiculoEntity veiculoEntity = new VeiculoEntity();
		veiculoEntity.setVeiculo(request.getVeiculo());
		veiculoEntity.setMarca(request.getMarca());
		veiculoEntity.setAno(request.getAno());
		veiculoEntity.setDescricao(request.getDescricao());
		veiculoEntity.setDisponibilidade(request.getDisponibilidade());
		veiculoEntity.setDataCadastro(request.getDataCadastro());
		veiculoEntity.setDataAtualizacao(request.getDataAtualizacao());
		return veiculoEntity;
	}

	@Override
	public List<VeiculoResponse> listaTodosVeiculos() {
		return veiculoRepository.findAll().stream().map(e -> new VeiculoResponse(e)).collect(Collectors.toList());
	}

	@Override
	public VeiculoResponse listarVeiculoPorId(Long id) {
		return entityToResponse(veiculoRepository.findById(id).get());
	}

	@Override
	public VeiculoResponse atualizarVeiculo(Long id, VeiculoRequest request) {
		Optional<VeiculoEntity> veiculoEntityOp = 
				veiculoRepository.findById(id);
		
		if(!veiculoEntityOp.isPresent()) {
			//IMPLEMENTAR O RETORNO DE UM ERRO IDENTIFICANDO QUE NÃO HÁ VEICULO CADASTRADO COM ESSE ID
			System.out.println("não há o veiculo solicitado para atualização");
			return null;
		}
		
		VeiculoEntity entity = veiculoEntityOp.get();
		entity.setVeiculo(request.getVeiculo());
		entity.setMarca(request.getMarca());
		entity.setAno(request.getAno());
		entity.setDescricao(request.getDescricao());
		entity.setDisponibilidade(request.getDisponibilidade());
		entity.setDataCadastro(request.getDataCadastro());
		entity.setDataAtualizacao(request.getDataAtualizacao());
		
		veiculoRepository.save(entity);
		
		return entityToResponse(entity);
		
	}

	@Override
	public void deletarVeiculo(Long id) {
		Optional<VeiculoEntity> veiculoEntityOp = 
				veiculoRepository.findById(id);
		
		if(veiculoEntityOp.isPresent()) {
			veiculoRepository.delete(veiculoEntityOp.get());
		}
		
		
		
	}

	@Override
	public List<VeiculoResponse> listarVeiculosFiltrados(String marca, Integer ano) {
		return customVeiculoRepository.buscarVeiculosFiltrados(marca, ano)
				.stream()
					.map(e -> new VeiculoResponse(e)).collect(Collectors.toList());
	}

	
}
