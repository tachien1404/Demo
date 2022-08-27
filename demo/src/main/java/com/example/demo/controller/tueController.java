package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tueController {

	@RequestMapping("/alo")
	public String tue(Model model) {
		model.addAttribute("tue", "DM có được không....clm");
		return "alo.html";
	}
}
