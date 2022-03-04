package com.garone.concessionariaauto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.concessionariaauto.dal.AutoDAO;
import com.garone.concessionariaauto.entities.Auto;

@Service
public class AutoServiceImpl implements AutoService {
	@Autowired
	private AutoDAO repo;
	
	
	@Override
	public void addAuto(Auto a) {
		this.repo.save(a);
		
	}

	@Override
	public List<Auto> getAll() {
		return this.repo.findAll();
	}

	@Override
	public Auto getOneById(int id) {
		return this.repo.getById(id);
	}

}
