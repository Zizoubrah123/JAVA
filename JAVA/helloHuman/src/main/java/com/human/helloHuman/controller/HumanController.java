package com.human.helloHuman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
    @RequestMapping("/")
    public String index(@RequestParam(value="q", required=false) String searchQuery, String Last_name) {
    	if (searchQuery == null) {
    		return "hello human";
    	}
        return "hello " + searchQuery +" " + Last_name;
    }
}
