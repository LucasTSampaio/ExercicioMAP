package com.fametro.map.exercicio.revisao1;

public class TestaConta {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente("1231213", 1000d, "José de José Josenilson");
		
		cc1.sacar(200d);
		cc1.depositar(200d);
		
		
		ContaPoupanca cp1 = new ContaPoupanca("87362632", 3000d, "Enzo Felipe Massa");
		cp1.emitirRelatorioConta();
	}
}
