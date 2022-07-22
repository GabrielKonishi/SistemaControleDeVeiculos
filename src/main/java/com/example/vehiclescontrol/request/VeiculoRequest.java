package com.example.vehiclescontrol.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VeiculoRequest {
	
	@JsonProperty("veiculo")
	private String veiculo;
	
	@JsonProperty("marca")
	private String marca;
	
	@JsonProperty("ano")
	private Integer ano;
	
	@JsonProperty("descricao")
	private String descricao;
	
	@JsonProperty("disponibilidade")
	private Boolean disponibilidade;
	
	@JsonProperty("data_cadastro")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime dataCadastro;
	
	@JsonProperty("data_atualizacao")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime dataAtualizacao;

	
	public VeiculoRequest() {
	}


	public VeiculoRequest(String veiculo, String marca, Integer ano, String descricao, Boolean disponibilidade,
			LocalDateTime dataCadastro, LocalDateTime dataAtualizacao) {
		this.veiculo = veiculo;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.disponibilidade = disponibilidade;
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
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
