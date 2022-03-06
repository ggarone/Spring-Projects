package com.garone.alimenti.presentation;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.garone.alimenti.entities.Alimento;
import com.garone.alimenti.service.AlimentoService;

@Controller
@RequestMapping({"","mvc"})
public class AlimentoMVC {
	@Autowired
	private AlimentoService service;
	
	//GET call to /alimenti/api/ (alimenti root folder setted in application.properties)
	@GetMapping
	public String getAlimenti(Model m, HttpSession session){
		session.setAttribute("ruolo", "admin");
		m.addAttribute("lista",this.service.getAlimenti());
		m.addAttribute("titolo","elenco alimenti");
		
		return "elenco";
	}
	
	@GetMapping("{id}")
	public ModelAndView getById(@PathVariable int id){
		ModelAndView mav = new ModelAndView("dettaglio");
		mav.addObject("titolo","dettaglio");
		mav.addObject("alimento", this.service.getAlimentoById(id));
		return mav;
	}
}
