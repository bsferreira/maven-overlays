package com.github.bsferreira.poc.maven.overlays.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

	@RequestMapping(value = "/common")
	public String view(ModelMap model) {

		model.addAttribute("commonMessage", "I'm a common page.");
		return "commonMessage";

	}

}