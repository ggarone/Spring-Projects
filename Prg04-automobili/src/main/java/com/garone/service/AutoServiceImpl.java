package com.garone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.dal.AutoDAO;
import com.garone.entities.AutoElettrica;

@Service
public class AutoServiceImpl implements AutoService{
	@Autowired
	private AutoDAO repo;

	@Override
	public List<AutoElettrica> getAll() {
		return repo.findAll();
	}

	@Override
	public void addAuto(AutoElettrica a) {
		repo.save(a);
	}

}
