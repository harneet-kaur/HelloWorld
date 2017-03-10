package com.stepforward.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value="/authenticateUser", method=RequestMethod.GET)
	public String AuthenticateUser(@RequestParam("username") String username,
			@RequestParam("password") String password){
		ModelAndView mv = new ModelAndView("login");
		
		if((username !=null && username.length()>0)  && (password !=null && password.length()>0)){
			if(username.equals("admin") && password.equals("admin")){
				mv.addObject("response", "YOU WILL BE MOVED ON LANDING PAGE SHORTLY");
			}else{
				mv.addObject("response", "INVALID CREDENTIALS");
			}	
		}else{
			mv.addObject("response", "ENTER USERNAME AND PASSWORD");
		}
		
		return password;
		
	}
}
