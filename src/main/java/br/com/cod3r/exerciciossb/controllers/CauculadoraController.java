package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CauculadoraController {
	
	// /calculadora/somar/10/20
	@GetMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a,@PathVariable int b) {
		return a + b;
	}

	// /calculadora/subtrair?b=50&a=100
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
		return a - b;
	}
	
	
	
	
}
