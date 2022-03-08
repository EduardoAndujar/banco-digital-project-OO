package com.dio.classes;

public class Cliente {

	private String nome;
	private String cpf;
	private String cep;
	private String email;

	public Cliente(String nome, String cpf, String cep) {
		this.nome = nome;
		this.cpf = cpf;
		this.cep = cep;
	}
	
	public Cliente(String nome, String cpf, String cep, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.cep = cep;
		this.email = email;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
