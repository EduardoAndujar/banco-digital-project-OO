package com.dio.classes;
import java.util.List;

public class Banco {

	private String nome;
	private int Agencia = 1;
	private List<Conta> contas;
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}