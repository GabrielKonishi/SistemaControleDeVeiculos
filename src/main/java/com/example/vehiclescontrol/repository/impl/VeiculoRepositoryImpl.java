package com.example.vehiclescontrol.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.vehiclescontrol.entity.VeiculoEntity;
import com.example.vehiclescontrol.repository.CustomVeiculoRepository;


@Repository
public class VeiculoRepositoryImpl implements CustomVeiculoRepository{

	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<VeiculoEntity> buscarVeiculosFiltrados(String marca, Integer ano) {
		StringBuilder sql = new StringBuilder();
		
		sql.append(" SELECT ");
		sql.append(" * ");
		sql.append(" from GH001_VEICULO ");
		sql.append(" WHERE ");
		sql.append(" 1 = 1 ");
		if (marca != null && (!marca.isEmpty() && !marca.isBlank())) {
			sql.append(" AND marca = :marca ");
		}
		if (ano != null) {
			sql.append(" AND ano = :ano");
		}
		
		
		Query query = entityManager.createNativeQuery(sql.toString(), VeiculoEntity.class);
		
		if (marca != null && (!marca.isEmpty() && !marca.isBlank())) {
			query.setParameter("marca", marca);
		}
		
		if (ano != null) {
			query.setParameter("ano", ano);
		}
		
		return query.getResultList();
	}

	
}
