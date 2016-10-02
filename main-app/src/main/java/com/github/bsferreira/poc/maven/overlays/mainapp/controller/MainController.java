package com.github.bsferreira.poc.maven.overlays.mainapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String view(ModelMap model) {

		model.addAttribute("message", "Hello World");
		return "index";

	}

}