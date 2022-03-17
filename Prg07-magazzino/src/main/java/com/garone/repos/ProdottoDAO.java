package com.garone.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.garone.entities.Prodotto;

@Repository
public interface ProdottoDAO extends JpaRepository<Prodotto, Integer> {
	
	//METHOD 1 (with custom query)
	@Query(value = "select * from products where quentita between :min and :max", nativeQuery = true)
	List<Prodotto> trovaProdotti(@Param("min") int min, @Param("max") int max);
	
	// METHOD 2 (declaration from spring)
	List<Prodotto> findProdottoByQuantitaBetween(int min, int max);
}
