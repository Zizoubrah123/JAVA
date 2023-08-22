package com.human.bookClub.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.human.bookClub.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findAll();
	
}
