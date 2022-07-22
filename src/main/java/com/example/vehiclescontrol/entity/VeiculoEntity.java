package com.example.vehiclescontrol.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GH001_VEICULO")
public class VeiculoEntity implements Serializable{
	
	private static final long serialVersionUID = 509475385879004847L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	
	private String veiculo;
	
	
	private String marca;
	
	
	private Integer ano;
	
	
	private String descricao;
	
	
	private Boolean disponibilidade;
	
	
	private LocalDateTime dataCadastro;
	
	
	private LocalDateTime dataAtualizacao;
	
	public VeiculoEntity() {
		super();
	}

	public VeiculoEntity(Long id, String veiculo, String marca, Integer ano, String descricao, Boolean disponibilidade,
			LocalDateTime dataCadastro, LocalDateTime dataAtualizacao) {
		super();
		this.id = id;
		this.veiculo = veiculo;
		this.marca = marca;
		this.ano = ano;
		this.descricao = descricao;
		this.disponibilidade = disponibilidade;
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
