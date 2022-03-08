package com.dio.classes;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Eduardo", "999.999.999-99", "99999-999");

		Conta cc = new ContaCorrente(cliente);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(cliente);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		
	}

}
