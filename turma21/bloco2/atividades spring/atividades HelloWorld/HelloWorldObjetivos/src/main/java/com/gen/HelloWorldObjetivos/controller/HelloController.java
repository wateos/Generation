package com.gen.HelloWorldObjetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloobjetivos")
public class HelloController {
	
	@GetMapping
	public String helloObjetivos(){
		
		return "Objetivos da sprint: aprender Spring Boot e fazer o back-end do Projeto integrador.";
	}

	
}
