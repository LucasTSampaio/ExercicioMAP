package com.fametro.map.exercicio.revisao1;

public class Conta {

	protected String numeroConta;
	protected double saldo;
	protected String nomeTitular;
	
	public void sacar(double valor) {
		if(valor>saldo) {
			System.out.println("Operação invalida");
		}
		this.saldo = this.saldo - valor;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo: " +this.saldo);
 	}
	
	public void emitirRelatorioConta() {
		System.out.println("----------------------------------");
		System.out.println("Relatório da conta: " +this.numeroConta);
		System.out.println("----------------------------------");
		System.out.println("Nome do titular: " +this.nomeTitular);
		System.out.println("----------------------------------");
		System.out.println("Saldo atual: " +this.saldo);
		System.out.println("----------------------------------");
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	
}
