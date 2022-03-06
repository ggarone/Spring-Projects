package com.garone.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garone.entities.AutoElettrica;

public interface AutoDAO extends JpaRepository<AutoElettrica, Integer>{

}
