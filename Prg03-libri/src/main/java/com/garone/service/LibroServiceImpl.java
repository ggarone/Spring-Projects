package com.garone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.dal.LibroDAO;
import com.garone.entities.Libro;

@Service
public class LibroServiceImpl implements LibroService {
	@Autowired
	private LibroDAO repo;
	
	
	@Override
	public List<Libro> getAll() {
		return repo.findAll();
	}

	@Override
	public Libro getLibroById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void addLibro(Libro l) {
		repo.save(l);
	}

}
