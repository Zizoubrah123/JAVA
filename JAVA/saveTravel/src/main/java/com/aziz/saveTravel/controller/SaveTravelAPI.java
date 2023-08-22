package com.aziz.saveTravel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aziz.saveTravel.model.Expense;
import com.aziz.saveTravel.service.SaveTravelService;

import jakarta.validation.Valid;

@Controller
public class SaveTravelAPI {
	
    private final SaveTravelService saveTravelService;
    
    public SaveTravelAPI(SaveTravelService saveTravelService){
        this.saveTravelService = saveTravelService;
      }
    
    @GetMapping("/")
    public String index(@ModelAttribute("saveTravel") Expense Expense, Model model) {
    	List<Expense> allSaveTravel = saveTravelService.allSaveTravel();
    	model.addAttribute("allTravel", allSaveTravel);
    	return"new.jsp";
    }
    
    @PostMapping("/travel/new")
    public String create(@Valid
    	@ModelAttribute("saveTravel") Expense expense,
    	BindingResult result,
        Model model
        ) 
    {
		if (result.hasErrors()) {
			List<Expense> allTheTravel = saveTravelService.allSaveTravel();
			model.addAttribute("saveTravelList", allTheTravel);
			return "new.jsp";
		} else {
			// save the book
			Expense newSaveTravel = saveTravelService.createSaveTravel(expense);
        
        

		return "redirect:/";
		}
    }
    @GetMapping("/travel/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Expense Expense = saveTravelService.findSaveTravel(id);
        model.addAttribute("SaveTravel", Expense);
        return "edit.jsp";
    }
    
    @PutMapping("/travel/{id}") 
    public String update(@Valid @ModelAttribute("SaveTravel") Expense Expense, BindingResult result) {
        if (result.hasErrors()) {
            return "/edit.jsp";
        } else {
            saveTravelService.updateSaveTravel(Expense);
            return "redirect:/";
        }
    }
	@DeleteMapping("/travel/{id}")
	public String delete(@PathVariable("id") Long id) {
		saveTravelService.deleteSaveTravel(id);
		return "redirect:/";
	}
	
	// Show One page
	@GetMapping("/travel/{id}/show")
	public String showone(@PathVariable("id") Long id, Model model) {
		Expense thisExpense=saveTravelService.findSaveTravel(id);
		model.addAttribute("oneexpense",thisExpense);
		return "show.jsp";
	}


}

//	@GetMapping("/persons/{person_id}")
//	public String showPerson(@PathVariable Long person_id, Model model) {
//	    
//	    Person someAwesomePerson = personService.findById(person_id);
//	    model.addAttribute("person", someAwesomePerson);
//	    
//	    return "showPerson.jsp";
//	}