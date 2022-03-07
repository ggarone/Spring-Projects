package com.garone.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garone.entities.Esame;
import com.garone.entities.Studente;
import com.garone.entities.StudentiEsami;

public interface StudentiEsamiDAO extends JpaRepository<StudentiEsami, Integer>{

	List<StudentiEsami> findStudenteByEsame(Esame e);
	List<StudentiEsami> findEsameByStudente(Studente s);
	
	
}
