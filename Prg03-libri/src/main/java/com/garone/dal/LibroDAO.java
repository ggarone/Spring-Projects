package com.garone.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garone.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer>{

}
