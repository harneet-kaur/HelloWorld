package com.stepforward.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	String message = "Working in spring MVC";

	@RequestMapping("/hello")
	public ModelAndView showData(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("message",message);
		mv.addObject("name",name);
		return mv;

	}
}
