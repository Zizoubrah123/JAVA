package com.spring.helloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("daikichi")

public class DaikichiController {

	
    @RequestMapping("/")
    public String index(){
    	return "demo.jsp";
    }
	
//    @RequestMapping("/{country}")
//    public String showKyoto(@PathVariable("country") String country){
//    	return "Congratulations! You will soon travel to " + country+" !!";
//    }
//
//    @RequestMapping("/{county}/{number}")
//    public String showLesson(@PathVariable("county") String county, @PathVariable("number") int number){
//    	if(number < 10){
//    		return "You will take a grand journey in the near future, but be weary of tempting offers";
//    	}
//    	return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.\"";
//    }
}
