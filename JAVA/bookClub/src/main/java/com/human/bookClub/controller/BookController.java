package com.human.bookClub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.human.bookClub.models.Book;
import com.human.bookClub.models.User;
import com.human.bookClub.service.BookServise;
import com.human.bookClub.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {
	@Autowired
	private BookServise bookService;
	@Autowired
	private UserService userService;

	@GetMapping("/welcome")
	public String welcome(Model model, HttpSession session) {
		 Long userId = (Long) session.getAttribute("user_id");
			
		 // ROUTE GUARD
		 if(userId == null) {
			 return "redirect:/";
		 }else {
				List<Book> allTheBooks = bookService.allBooks();
				model.addAttribute("booksList", allTheBooks);
				model.addAttribute("user", userService.findOne(userId));
//				model.addAttribute("user", );
		return "welcome.jsp";
		 }
	}
	
	@GetMapping("/books/new")
	public String create(@ModelAttribute("book") Book book,
						Model model, HttpSession session) {
		model.addAttribute("user", userService.findOne((Long) session.getAttribute("user_id")));
		 if(session.getAttribute("user_id") == null) {
			 return "redirect:/";
		 }
		return "create.jsp";
	}
//    
	@PostMapping("/books")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result,
							Model m, HttpSession session) {
		if (session.getAttribute("user_id")==null) return "redirect:/";
		if (result.hasErrors()) {
			return "create.jsp";
		} else {
			// save the book
			//1. grab the current user's ID from Session
			Long userID = (Long) session.getAttribute("user_id");
			//2. fetch the user from the DB
			User currentUser  = userService.findOne(userID);
			System.out.println(currentUser);
			//3. setAuthor to be the the current user
			book.setUser(currentUser);
			book.setPostedBy(currentUser.getUserName());
			Book newBook = bookService.createBook(book);
		return "redirect:/welcome";
		}
		
		
		
	}
	@GetMapping("/book/{id}")
	public String bookAndUser(@PathVariable("id") Long id, @ModelAttribute("user")User user, Model model ) {
		Book oneBook = bookService.findBook(id);  
		model.addAttribute("oneBook", oneBook);
		System.out.println(oneBook);
		
		
		return"show.jsp";
	}
	
	
	// Display Route - Edit form
	
	@GetMapping("books/{id}/edit")
	public String editPage(@PathVariable("id") Long id, Model model) {
		
		// find that book with provided id
		Book thisBook = bookService.findBook(id);
		
		// pass thisBook to the jsp page 
		model.addAttribute("book",thisBook);
		
		return "edit.jsp";
	}
	
	@PutMapping("/books/{id}/edit")
	public String updateBook(@Valid @ModelAttribute("book") Book book, Model model, BindingResult result,HttpSession session) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			// if there are no errors update book
			Long userID = (Long) session.getAttribute("user_id");

			User currentUser  = userService.findOne(userID);
			System.out.println(currentUser);
			//3. setAuthor to be the the current user
			book.setUser(currentUser);
			book.setPostedBy(currentUser.getUserName());
			model.addAttribute("userID",currentUser.getId());

			bookService.updateBook(book);
			return "redirect:/welcome";
		}
	}
	
	@DeleteMapping("/books/{id}")
	public String delete(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return "redirect:/welcome";
	}
}
