package com.aziz.bookApi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aziz.bookApi.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findAll();
	
    List<Book> findByDescriptionContaining(String search);

	
}
