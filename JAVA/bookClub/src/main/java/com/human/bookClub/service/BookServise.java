package com.human.bookClub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.bookClub.models.Book;
import com.human.bookClub.repository.BookRepository;

@Service
public class BookServise {

	@Autowired
	private BookRepository bookRepo;
	

	
	 // returns all the books
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    
    
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // UPDATE
    public Book updateBook(Book b) {
		return bookRepo.save(b);
	}
    // DELETE
 	public void deleteBook(Long id) {
 		bookRepo.deleteById(id);
 	}
}
