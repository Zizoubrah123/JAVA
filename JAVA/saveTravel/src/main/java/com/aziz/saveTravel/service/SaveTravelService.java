package com.aziz.saveTravel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aziz.saveTravel.Repository.SaveTravelRepository;
import com.aziz.saveTravel.model.Expense;

@Service
public class SaveTravelService {
	
	private final SaveTravelRepository saveTravelRepository;
	
	public SaveTravelService(SaveTravelRepository saveTravelRepository){
		this.saveTravelRepository = saveTravelRepository;
	}
	
	 // returns all the books
    public List<Expense> allSaveTravel() {
        return saveTravelRepository.findAll();
    }
    // creates a book
    public Expense createSaveTravel(Expense b) {
        return saveTravelRepository.save(b);
    }
    // retrieves a book
    public Expense findSaveTravel(Long id) {
        Optional<Expense> optionalSaveTravel = saveTravelRepository.findById(id);
        if(optionalSaveTravel.isPresent()) {
            return optionalSaveTravel.get();
        } else {
            return null;
        }
    }
    // UPDATE
    public Expense updateSaveTravel(Expense b) {
		return saveTravelRepository.save(b);
	}
    // DELETE
 	public void deleteSaveTravel(Long id) {
 		saveTravelRepository.deleteById(id);
 	}
}
