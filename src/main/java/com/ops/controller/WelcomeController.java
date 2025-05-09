package com.ops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("title", "Title: DevOps Service");
		model.addAttribute("pageTitle", "Page Title: DevOps Service");
		model.addAttribute("msg", "Msg: Welcome To DepOps CI/CD pipeline demo, Commit shanto bhai is here");

		model.addAttribute("msg2", "Msg2: Welcome To DepOps CI/CD pipeline demo!");

		return "index";
	}
}
