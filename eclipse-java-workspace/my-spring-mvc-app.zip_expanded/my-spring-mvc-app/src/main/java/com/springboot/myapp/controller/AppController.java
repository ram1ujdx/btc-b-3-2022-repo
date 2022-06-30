package com.springboot.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello.jsp";
	}
	
}
