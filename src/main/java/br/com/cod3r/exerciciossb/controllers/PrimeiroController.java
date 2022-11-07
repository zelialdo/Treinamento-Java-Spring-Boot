package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	
	@GetMapping(path = {"/saudacao", "/ola"})// posso passar mais de um URL "endereço"
	public String ola() {
		return "Olá Spring Boot";
	}
	
//	@PostMapping(path = {"/saudacao"})// simulando erros... dois metodos na mesma URL 
//	public String saudacao() {
//		return "Olá Spring Boot(POST)";
//	}
}
 