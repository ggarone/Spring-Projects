package com.garone.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garone.entities.Esame;

public interface EsameDAO extends JpaRepository<Esame, Integer> {

	List<Esame> findByCrediti(int crediti);
	List<Esame> findByNomeContaining(String nome);
	
}
