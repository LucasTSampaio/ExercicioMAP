package com.fametro.map.exercicio.revisao1;

public class ContaPoupanca extends Conta implements IViaEmail{
	
	private double rendimentos = 30d;

	public ContaPoupanca(String numeroConta, double saldo, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.nomeTitular = nomeTitular;
	}
	
	public void enviarViaEmail(String email) {
		System.out.println("Enviando relatorio...via email de cliente: " +email+ " \n ");
		emitirRelatorioConta();
	}
	
	public void emitirRelatorioConta() {
		super.emitirRelatorioConta();
		System.out.println("Rendimento mensal: " +this.rendimentos);
		System.out.println(("----------------------------------"));
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}


}
