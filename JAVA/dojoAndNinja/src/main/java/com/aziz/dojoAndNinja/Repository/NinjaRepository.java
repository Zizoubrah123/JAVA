package com.aziz.dojoAndNinja.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aziz.dojoAndNinja.model.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	// this method retrieves all the books from the database
    List<Ninja> findAll();
    
}
