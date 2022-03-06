package com.garone.service;

import java.util.List;

import com.garone.entities.Libro;

public interface LibroService {
	List<Libro> getAll();
	Libro getLibroById(int id);
	void addLibro(Libro l);
}
