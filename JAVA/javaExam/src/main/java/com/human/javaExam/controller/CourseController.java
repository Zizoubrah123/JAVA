package com.human.javaExam.controller;

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

import com.human.javaExam.models.YogaCourse;
import com.human.javaExam.models.User;
import com.human.javaExam.service.YogaCourseServise;
import com.human.javaExam.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class CourseController {
	@Autowired
	private YogaCourseServise courseService;
	@Autowired
	private UserService userService;

	@GetMapping("/classes")
	public String welcome(Model model, HttpSession session) {
		 Long userId = (Long) session.getAttribute("user_id");
			
		 // ROUTE GUARD
		 if(userId == null) {
			 return "redirect:/";
		 }else {
				List<YogaCourse> allTheclasses = courseService.allCourses();
				model.addAttribute("allclasses", allTheclasses);
				model.addAttribute("user", userService.findOne(userId));
//				model.addAttribute("user", );
		return "welcome.jsp";
		 }
	}
	
	@GetMapping("/classes/new")
	public String create(@ModelAttribute("class") YogaCourse yogaCourse,
						Model model, HttpSession session) {
		model.addAttribute("user", userService.findOne((Long) session.getAttribute("user_id")));
		 Long userId = (Long) session.getAttribute("user_id");
			
		 // ROUTE GUARD
		 if(userId == null) {
			 return "redirect:/";
		 }else {
		return "create.jsp";
		 }
		 }
//    
	@PostMapping("/class/new")
	public String createBook(@Valid @ModelAttribute("class") YogaCourse yogaCourse, BindingResult result,
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
			yogaCourse.setUser(currentUser);
			yogaCourse.setInstructor(currentUser.getUserName());
			YogaCourse newBook = courseService.createCourse(yogaCourse);
		return "redirect:/classes";
		}
		
		
		
	}
	@GetMapping("/class/{id}")
	public String bookAndUser(@PathVariable("id") Long id, @ModelAttribute("user")User user, Model model ) {
		YogaCourse oneClass = courseService.findCourse(id);  
		model.addAttribute("oneClass", oneClass);
		System.out.println(oneClass);
		
		
		return"show.jsp";
	}
	
	
	// Display Route - Edit form
	
	@GetMapping("class/{id}/edit")
	public String editPage(@PathVariable("id") Long id, Model model) {
		
		// find that book with provided id
		YogaCourse thisClass = courseService.findCourse(id);
//		System.out.println(id);
		// pass thisBook to the jsp page 
		model.addAttribute("thisClass",thisClass);
		model.addAttribute("id", id);

		
		return "edit.jsp";
	}
	
	@PutMapping("/class/{id}/edit")
	public String updateBook(@Valid @ModelAttribute("thisClass") YogaCourse yogaCourse,  BindingResult result,Model model,HttpSession session) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			// if there are no errors update book
			Long userID = (Long) session.getAttribute("user_id");

			User currentUser  = userService.findOne(userID);
			System.out.println(currentUser.getId());
			//3. setAuthor to be the the current user
			yogaCourse.setUser(currentUser);
			model.addAttribute("userID",currentUser.getId());
			yogaCourse.setInstructor(currentUser.getUserName());

			courseService.updateCourse(yogaCourse);
			return "redirect:/classes";
		}
	}
	
	@DeleteMapping("/class/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		courseService.deleteCourse(id);
		return "redirect:/classes";
	}
}
