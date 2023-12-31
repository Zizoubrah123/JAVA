package com.aziz.bookApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aziz.bookApi.servises.BookService;


@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	
	@GetMapping("/api/{bookId}")
	public String index(Model model, @PathVariable("bookId") Long bookId) {
	
		model.addAttribute("book", bookService.findBook(bookId));
		
		return "show.jsp";
	}
}
