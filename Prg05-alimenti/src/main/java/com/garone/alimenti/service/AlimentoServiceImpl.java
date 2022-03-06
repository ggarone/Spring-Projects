package com.garone.alimenti.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.alimenti.dal.AlimentoDAO;
import com.garone.alimenti.entities.Alimento;

@Service
public class AlimentoServiceImpl implements AlimentoService {
	@Autowired
	private AlimentoDAO repo;
	private Map<Integer, Alimento> alimentiMap;
	
	public Map<Integer, Alimento> getAlimentiMap() {
		if(alimentiMap == null) {
			alimentiMap = new TreeMap<Integer, Alimento>();
			for (Alimento a : getAlimenti()) {
				alimentiMap.put(a.getId(), a);
			}
		}
		return alimentiMap;
	}

	@Override
	public void addAlimento(Alimento a) {
		repo.save(a);
	}

	@Override
	public void updateAlimento(Alimento a) {
		repo.save(a);
	}

	@Override
	public void deleteAlimento(int id) {
		repo.deleteById(id);
	}
	
	@Override
	public Alimento getAlimentoById(int id) {
		// TODO Auto-generated method stub
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return new Alimento();
	}
	
	@Override
	public List<Alimento> getAlimenti() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Alimento> getAlimentiByCategoria(String categoria) {
		return this.repo.findByCategoriaStartingWith(categoria);
	}

	@Override
	public List<Alimento> getAlimentiByEnergia(int min, int max) {
		return this.repo.findByEnergiaBetweenOrderByEnergia(min, max);
	}

	@Override
	public List<String> getCategorie() {
		return repo.trovaCategorie();
	}
}
