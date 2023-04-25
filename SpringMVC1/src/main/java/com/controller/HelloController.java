package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {
@RequestMapping("/hello")
	 public String hello(Model mode) {
		 System.out.println("Hello Welcome");
		 mode.addAttribute("message", "Hello World!");
		 return "index";
  }
}