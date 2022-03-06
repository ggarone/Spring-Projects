package com.garone.alimenti.integration;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garone.alimenti.entities.Alimento;
import com.garone.alimenti.service.AlimentoService;

@RestController
@RequestMapping({"api","rest"})
public class AlimentoREST {
	@Autowired
	private AlimentoService service;
	
	//GET call to /alimenti/api/ (alimenti root folder setted in application.properties)
	@GetMapping
	public List<Alimento> getAlimenti(){
		return this.service.getAlimenti();
	}
	
	@GetMapping("{id}")
	public Alimento getById(@PathVariable int id){
		return this.service.getAlimentoById(id);
	}
	
	@GetMapping("/categoria/{cat}")
	public List<Alimento> getByCat(@PathVariable("cat") String categoria){
		return this.service.getAlimentiByCategoria(categoria);
	}
	
	@GetMapping("/categorie")
	public List<String> getCategorie(){
		return this.service.getCategorie();
	}

	@GetMapping("/alimentiMAP")
	public Map<Integer,Alimento> getAliMap(){
		return this.service.getAlimentiMap();
	}
	
	@GetMapping("/energia/{min}/{max}")
	public List<Alimento> getByEnergia(@PathVariable int min, @PathVariable int max){
		return this.service.getAlimentiByEnergia(min, max);
	}
	
	@GetMapping("/categorieFunzionali")
	public List<String> getCatFunct(){
		return this.service.getAlimenti().stream()
				.map(a -> a.getCategoria())
				.distinct()
				.sorted()
				.toList();
	}
	
	@PostMapping
	public void addAlimento(@RequestBody Alimento a) {
		this.service.addAlimento(a);
		this.getAlimenti();
	}
	
	@PutMapping
	public void updateAlimento(@RequestBody Alimento a) {
		this.service.updateAlimento(a);
	}
	
	@DeleteMapping("{id}")
	public void deleteAlimento(@PathVariable int id) {
		this.service.deleteAlimento(id);
	}
}
