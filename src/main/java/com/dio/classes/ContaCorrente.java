package com.dio.classes;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("========== Extrato Conta Corrente ==========");
		super.imprimirInfosConta();
	}
	
	@Override
	public String toString() {
		return "Esta a conta corrente " + this.getNumeroConta() + " da ag�ncia " + this.getAgencia() + " e pertence a " + this.cliente.getNome() + ".";
	}
}
