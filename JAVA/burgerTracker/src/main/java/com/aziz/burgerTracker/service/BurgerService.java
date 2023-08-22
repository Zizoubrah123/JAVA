package com.aziz.burgerTracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aziz.burgerTracker.Repository.BurgerRepository;
import com.aziz.burgerTracker.model.Burger;

@Service
public class BurgerService {
	
	private final BurgerRepository burgerRepository;
	
	public BurgerService(BurgerRepository burgerRepository){
		this.burgerRepository = burgerRepository;
	}
	
	 // returns all the books
    public List<Burger> allBooks() {
        return burgerRepository.findAll();
    }
    // creates a book
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    // retrieves a book
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }
    // UPDATE
    public Burger updateBurger(Burger b) {
		return burgerRepository.save(b);
	}
    // DELETE
 	public void deleteBurger(Long id) {
 		burgerRepository.deleteById(id);
 	}
}
