package com.garone.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garone.entities.Libro;
import com.garone.service.LibroService;

@RestController
@RequestMapping("api/libri")
public class LibroREST {
	@Autowired
	private LibroService service;
	
	@GetMapping
	public List<Libro> getAll(){
		return service.getAll();
	}
}
