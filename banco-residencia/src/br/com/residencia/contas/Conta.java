package br.com.residencia.contas;

public abstract class Conta {
	
	private String cpf, agencia, numero, tipo;
	private double saldo;

	
	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			//System.out.println("Saldo insuficiente!");
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean transferir(double valor, Conta destinatario) {
		//boolean retirou = this.sacar(valor);
		if(this.sacar(valor)) {
			destinatario.depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	
	
	//Tipo, numero, agencia, saldo
	
	
	
	
	
	
}
