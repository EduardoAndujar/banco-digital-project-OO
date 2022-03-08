package com.dio.classes;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int numeroConta;
	protected int agencia;
	protected double saldo;
	protected Cliente cliente;

	// Construtor
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	// Metodos
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInfosConta() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("N�mero da conta: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	// Getters
	public int getNumeroConta() {
		return numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

}
