package com.garone.alimenti.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.garone.alimenti.entities.Alimento;

@Repository
public interface AlimentoDAO extends JpaRepository<Alimento,Integer>{
	List<Alimento> findByCategoriaStartingWith(String categoria);
	
	@Query(value = "select distinct(categoria) from alimenti order by categoria", nativeQuery = true)
	List<String> trovaCategorie();
	
	List<Alimento> findDistinctByEnergia(int energia);
	List<Alimento> findByEnergiaBetweenOrderByEnergia(int min, int max);
	int countByCategoria(String categoria);
	
	
}
