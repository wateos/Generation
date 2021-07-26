package com.gen.HelloWorldMentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellomentalidades")
public class HelloController {
	
	@GetMapping
	public String helloMentalidades(){
		
		return "Mentalidades e Habilidades usadas na atividade: Metalidade de Persistência e Habilidade de Atenção aos Detalhes.";
	}
}
