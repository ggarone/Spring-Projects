package com.garone.concessionariaauto.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garone.concessionariaauto.entities.Auto;
import com.garone.concessionariaauto.service.AutoService;

@RestController
@RequestMapping("api/auto")
public class AutoREST {
	@Autowired
	private AutoService service;
	
	// GET call to /api/auto
	@GetMapping()
	public List<Auto> tutteLeAuto() {
		return this.service.getAll();
	}
	
	//POST call to /api/auto
	@PostMapping
	public void addAuto(@RequestBody Auto a) {
		this.service.addAuto(a);
	}
	
}
