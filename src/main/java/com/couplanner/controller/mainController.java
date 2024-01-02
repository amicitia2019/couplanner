package com.couplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class mainController {

	private final Logger log = LoggerFactory.getLogger(mainController.class);
	
	@RequestMapping("/")
	public String main() {
		return "home";
	}
}
