package com.garone.service;

import java.util.List;

import com.garone.entities.AutoElettrica;

public interface AutoService {
	public List<AutoElettrica> getAll();
	void addAuto(AutoElettrica a);
}
