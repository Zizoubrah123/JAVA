package com.aziz.dojoAndNinja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.aziz.dojoAndNinja.model.Dojo;
import com.aziz.dojoAndNinja.model.Ninja;
import com.aziz.dojoAndNinja.service.DojoService;
import com.aziz.dojoAndNinja.service.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {
	@Autowired
    private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
    
    
    @GetMapping("/ninjas")
    public String index(@ModelAttribute("ninja") Ninja Ninja, Model model) {
    	List<Dojo>  listDojos = dojoService.allDojos();
    	model.addAttribute("listDojos", listDojos);
    	return"new.jsp";
    }
    
    @PostMapping("/ninja/new")
    public String create(@Valid
    	@ModelAttribute("ninja") Ninja ninja,
    	BindingResult result,
        Model model
        ) 
    {
		if (result.hasErrors()) {
	    	List<Dojo>  listDojos = dojoService.allDojos();
			model.addAttribute("listDojos", listDojos);
			return "new.jsp";
		} else {
			// save the book
			Ninja newSaveTravel = ninjaService.createNinja(ninja);
        
        

		return "redirect:/";
		}
    }
//    @GetMapping("/travel/{id}/edit")
//    public String edit(@PathVariable("id") Long id, Model model) {
//        Ninja Ninja = ninjaService.findNinja(id);
//        model.addAttribute("SaveTravel", Ninja);
//        return "edit.jsp";
//    }
//    
//    @PutMapping("/travel/{id}") 
//    public String update(@Valid @ModelAttribute("SaveTravel") Ninja Ninja, BindingResult result) {
//        if (result.hasErrors()) {
//            return "/edit.jsp";
//        } else {
//            ninjaService.updateNinja(Ninja);
//            return "redirect:/";
//        }
//    }
//	@DeleteMapping("/travel/{id}")
//	public String delete(@PathVariable("id") Long id) {
//		ninjaService.deleteNinja(id);
//		return "redirect:/";
//	}
//	
//	// Show One page
//	@GetMapping("/travel/{id}/show")
//	public String showone(@PathVariable("id") Long id, Model model) {
//		Ninja thisExpense=ninjaService.findNinja(id);
//		model.addAttribute("oneexpense",thisExpense);
//		return "show.jsp";
//	}

}