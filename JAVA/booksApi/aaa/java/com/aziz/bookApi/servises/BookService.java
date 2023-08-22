package com.aziz.bookApi.servises;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aziz.bookApi.models.Book;
import com.aziz.bookApi.repository.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    } 
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll(); 
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // update a book
    public Book updateBook(Book b) {
        return bookRepository.save(b);
    }

    
    public List<Book> bookContaining(String search){
    	return bookRepository.findByDescriptionContaining(search);
    }
    
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }

}