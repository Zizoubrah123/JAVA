package com.azizo.mikujiForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	@GetMapping("/omikuji")
	public String index() {
		return "Index.jsp";
		
	}
	
	@PostMapping("/login")
		public String login(
				@RequestParam(value="number") int number,
				@RequestParam(value="city") String city,
				@RequestParam(value="person") String person,
				@RequestParam(value="hobby") String hobby,
				@RequestParam(value="livingThing") String livingThing,
				@RequestParam(value="someone") String someone,

				HttpSession session
				) {
			session.setAttribute("number", number);
			session.setAttribute("city", city);
			session.setAttribute("person", person);
			session.setAttribute("hobby", hobby);
			session.setAttribute("livingThing", livingThing);
			session.setAttribute("someone", someone);
			return "redirect:/show";
	}
	@GetMapping("/show")
	public String home() {
		return "welcome.jsp";
	}
}
