package com.aziz.dojoAndNinja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.aziz.dojoAndNinja.Repository.DojoRepository;
import com.aziz.dojoAndNinja.model.Dojo;

@Service
public class DojoService {
	@Autowired
	private DojoRepository DojoRepo;
	
	// READ ALL
	public List<Dojo> allDojos(){
		return DojoRepo.findAll();
	}
	
	// CREATE
	public Dojo createDojo(Dojo d) {
		return DojoRepo.save(d);
	}
	
	// READ ONE
	public Dojo findDojo(Long id) {
		
		Optional<Dojo> maybeDojo = DojoRepo.findById(id);
		if(maybeDojo.isPresent()) {
			return maybeDojo.get();
		}else {
			return null;
		}
	}
	
	// UPDATE 
	public Dojo updateDojo(Dojo d) {
		return DojoRepo.save(d);
	}
	
	// DELETE
	public void deleteDojo(Long id) {
		DojoRepo.deleteById(id);
	}
}
