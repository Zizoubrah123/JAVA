package com.human.bookClub.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.human.bookClub.models.Book;
import com.human.bookClub.models.LoginUser;
import com.human.bookClub.models.User;
import com.human.bookClub.service.BookServise;
import com.human.bookClub.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


@Controller
public class HomeController {
	
	// Add once service is implemented:
	 @Autowired
	 private UserService userServ;
	 private BookServise bookService;
	
	// DISPLAY ROUTE - forms
	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "LogReg.jsp";
	}
	
//	@GetMapping("/welcome")
//	public String welcome(Model model, HttpSession session) {
//		 Long userId = (Long) session.getAttribute("user_id");
//			
//		 // ROUTE GUARD
//		 if(userId == null) {
//			 return "redirect:/";
//		 }else {
//
//		return "welcome.jsp";
//		 }
//	}

	// ACTION ROUTE - REGISTER
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		// TO-DO Later -- call a register method in the service
		// to do some extra validations and create a new user!
		//1. execute the Service to Register first
		userServ.register(newUser, result);
		if (result.hasErrors()) {
			// Be sure to send in the empty LoginUser before
			// re-rendering the page.
			model.addAttribute("newLogin", new LoginUser());
			return "LogReg.jsp";
		}

		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		// in other words, log them in.
		session.setAttribute("user_id", newUser.getId());
		session.setAttribute("userName", newUser.getUserName());
		
		return "redirect:/welcome";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {

		// Add once service is implemented:
		 User user = userServ.login(newLogin, result);

		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "LogReg.jsp";
		}

		// No errors!
		// TO-DO Later: Store their ID from the DB in session,
		// in other words, log them in.
		session.setAttribute("user_id", user.getId());
		session.setAttribute("userName", user.getUserName());

		return "redirect:/welcome";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession s) {
		s.invalidate();
		
		return "redirect:/";
		}



}
