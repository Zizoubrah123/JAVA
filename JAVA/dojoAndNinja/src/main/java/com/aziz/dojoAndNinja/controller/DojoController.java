package com.aziz.dojoAndNinja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.aziz.dojoAndNinja.model.Dojo;
import com.aziz.dojoAndNinja.model.Ninja;
import com.aziz.dojoAndNinja.service.DojoService;
import com.aziz.dojoAndNinja.service.NinjaService;

import jakarta.validation.Valid;

@Controller
public class DojoController {

	@Autowired
    private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/")
	public String create(@ModelAttribute("dojo")Dojo dojo) {
		return "dojo.jsp";
	}
	
	@PostMapping("/dojo/new")
	public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result) {
		
		if (result.hasErrors()) {
			
			return "dojo.jsp";
		} else {
			Dojo newDojo = dojoService.createDojo(dojo);
			return "redirect:/ninja/new";
		}
	}
	
	@GetMapping("/dojo/{id}")
	public String ninjaAndDojo(@PathVariable("id") Long id, @ModelAttribute("dojo")Dojo dojo, Model model ) {
		List<Ninja> Ninjas = ninjaService.allNinjas();
		model.addAttribute("Ninjas", Ninjas);
		model.addAttribute("Dojos", id);
		
		return"show.jsp";
	}
	
	
	
}
