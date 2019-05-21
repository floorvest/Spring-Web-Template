package com.example.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ErrorController
 */
@Controller
public class ErrorControllerCustom implements ErrorController {

	@GetMapping("/error")
	public String error() {
		return "errors/404";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}