package com.fametro.map.exercicio.revisao1;

public class ContaCorrente extends Conta{
	
	private double limiteInicial;
	
	public ContaCorrente(String numeroConta, double saldo, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.nomeTitular = nomeTitular;
	}

	public void enviarViaEmail(String email) {
		System.out.println("Enviando relatorio...via email cliente: " +email+ " \n ");
		emitirRelatorioConta();
	}

	public double getLimiteInicial() {
		return limiteInicial;
	}

	public void setLimiteInicial(double limiteInicial) {
		this.limiteInicial = limiteInicial;
	}
	
	
	
}
