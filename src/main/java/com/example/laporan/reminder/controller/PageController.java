package com.example.laporan.reminder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	@GetMapping("/")
	public ModelAndView index(Model model) {
		
		return new ModelAndView("index");
	}
	
	
}
