package com.garone.concessionariaauto.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garone.concessionariaauto.entities.Auto;

public interface AutoDAO extends JpaRepository<Auto, Integer> {

}
