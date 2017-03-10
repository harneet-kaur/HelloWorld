package com.stepforward.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value="/authenticate-user", method=RequestMethod.GET)
	public String AuthenticateUser(@RequestParam("username") String username,
			@RequestParam("password") String password){
		System.out.println("HARNEET");
		return "ok";
	}
}
