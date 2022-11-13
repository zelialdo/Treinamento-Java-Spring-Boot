package br.com.cod3r.exerciciossb.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String nome;
	
	public Produto(){
		
	}

	public Produto(String nome) {
		super();
		this.nome = nome;
	}
	
	

}
