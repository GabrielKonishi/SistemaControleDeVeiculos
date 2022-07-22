package com.example.vehiclescontrol.response;

import java.time.LocalDateTime;

import com.example.vehiclescontrol.entity.VeiculoEntity;

public class VeiculoResponse {

private String veiculo;
	
	
	private String marca;
	
	
	private Integer ano;
	
	
	private String descricao;
	
	
	private Boolean disponibilidade;
	
	
	private LocalDateTime dataCadastro;
	
	
	private LocalDateTime dataAtualizacao;

	public VeiculoResponse() {
	}


	public VeiculoResponse(String veiculo, String marca, Integer ano, String descricao, Boolean disponibilidade,
			LocalDateTime dataCadastro, LocalDateTime dataAtualizacao) {
		this.veiculo = veiculo;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.disponibilidade = disponibilidade;
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
	}
	
	
	


	public VeiculoResponse(VeiculoEntity entity) {
		this.veiculo = entity.getVeiculo();
		this.marca = entity.getMarca();
		this.ano = entity.getAno();
		this.descricao = entity.getDescricao();
		this.disponibilidade = entity.getDisponibilidade();
		this.dataCadastro = entity.getDataCadastro();
		this.dataAtualizacao = entity.getDataAtualizacao();
	}


	public String getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Boolean getDisponibilidade() {
		return disponibilidade;
	}


	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}


	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}


	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	
	
	
	
	
}
