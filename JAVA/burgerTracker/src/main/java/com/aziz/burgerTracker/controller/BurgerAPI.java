package com.aziz.burgerTracker.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aziz.burgerTracker.model.Burger;
import com.aziz.burgerTracker.service.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerAPI {
	
    private final BurgerService burgerService;
    
    public BurgerAPI(BurgerService burgerService){
        this.burgerService = burgerService;
      }
    
    @GetMapping("/new")
    public String index(@ModelAttribute("burger") Burger burger, Model model) {
    	List<Burger> allBurgers = burgerService.allBooks();
    	model.addAttribute("burgerList", allBurgers);
    	return"new.jsp";
    }
    
    @PostMapping("/burgers")
    public String create(@Valid
    	@ModelAttribute("burger") Burger burger,
    	BindingResult result,
        Model model
        ) 
    {
		if (result.hasErrors()) {
			List<Burger> allTheBooks = burgerService.allBooks();
			model.addAttribute("booksList", allTheBooks);
			return "new.jsp";
		} else {
			// save the book
			Burger newBurger = burgerService.createBurger(burger);
        
        

		return "redirect:/new";
		}
    }
    @RequestMapping("/burger/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Burger burger = burgerService.findBurger(id);
        model.addAttribute("burger", burger);
        return "edit.jsp";
    }
    
    @RequestMapping(value="/burger/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
        if (result.hasErrors()) {
            return "/edit.jsp";
        } else {
            burgerService.updateBurger(burger);
            return "redirect:/new";
        }
    }
	@DeleteMapping("/burger/{id}")
	public String delete(@PathVariable("id") Long id) {
		burgerService.deleteBurger(id);
		return "redirect:/new";
	}
//    @RequestMapping("/api/books")
//    public List<burger> index() {
//        return bookService.allBooks();
//    }
//    
//    @PostMapping("/api/books")
//    public burger create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//        burger book = new burger(title, desc, lang, numOfPages);
//        return bookService.createBook(book);
//    }
//    
//    @RequestMapping("/api/books/{id}")
//    public burger show(@PathVariable("id") Long id) {
//        burger book = bookService.findBook(id);
//        return book;
//    }
//    
//    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
//    public burger update(
//    		 @ModelAttribute("book") burger book) {
//        burger Book = bookService.updateBook(book);
//        return Book;
//    }
//    
//    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
//    public void destroy(@PathVariable("id") Long id) {
//        bookService.deleteBook(id);
//    }
}