package com.garone.canzoni.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.canzoni.dal.CanzoneDAO;
import com.garone.canzoni.entities.Canzone;

@Service
public class CanzoneServiceImpl implements CanzoneService {
	@Autowired
	private CanzoneDAO repo;
	
	
	@Override
	public void addCanzone(Canzone c) {
		this.repo.save(c);

	}

	@Override
	public void updCanzone(Canzone c) {
		this.repo.save(c);
	}

	@Override
	public void delCanzone(int id) {
		this.repo.deleteById(id);
	}

	@Override
	public List<Canzone> getCanzoni() {
		return this.repo.findAll();
	}

	@Override
	public List<Canzone> getCanzoniByGenere(String genere) {
		// TODO Auto-generated method stub
		return this.repo.findByGenere(genere);
	}

	@Override
	public List<Canzone> getCanzoniByCantante(String cantante) {
		// TODO Auto-generated method stub
		return this.repo.findByCantante(cantante);
	}

	@Override
	public List<Canzone> getCazoniByTitolo(String titolo) {
		// TODO Auto-generated method stub
		return this.repo.findByTitoloContaining(titolo);
	}

	@Override
	public Optional<Canzone> getCanzoneById(int id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id);
	}

}
