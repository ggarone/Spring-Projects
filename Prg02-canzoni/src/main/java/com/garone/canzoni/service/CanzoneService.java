package com.garone.canzoni.service;

import java.util.List;
import java.util.Optional;

import com.garone.canzoni.entities.Canzone;


public interface CanzoneService {
	void addCanzone(Canzone c);
	void updCanzone(Canzone c);
	void delCanzone(int id);
	
	List<Canzone> getCanzoni();
	List<Canzone> getCanzoniByGenere(String genere);
	List<Canzone> getCanzoniByCantante(String cantante);
	List<Canzone> getCazoniByTitolo(String titolo);
	
	Optional<Canzone> getCanzoneById(int id);
}
