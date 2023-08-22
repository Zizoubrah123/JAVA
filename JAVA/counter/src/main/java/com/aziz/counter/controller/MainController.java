package com.aziz.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	
	
	@RequestMapping("/your_server")
    public String index(HttpSession session){
		var count= (int)session.getAttribute("count")+1;
		session.setAttribute("count",count);
	      return "index.jsp";
	    }
	@RequestMapping("/your_server/counter")
    public String counter(HttpSession session){
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
	      return "NewFile.jsp";
	    }
}
