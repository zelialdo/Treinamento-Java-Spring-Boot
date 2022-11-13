package br.com.cod3r.exerciciossb.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cliente {
	
	private int id;
	private String nome;
	private String cpf;
	
	

}
