package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

	@GetMapping
	public String get() {
		return "Requesição GET";
	}
	
	@PostMapping
	public String post() {
		return "Requesição POST";
	}
	
	@PutMapping
	public String put() {
		return "Requesição PUT";
	}
	
	@PatchMapping
	public String patch() {
		return "Requesição PATCH";
	}
	
	@DeleteMapping
	public String delete() {
		return "Requesição DELETE";
	}
}
