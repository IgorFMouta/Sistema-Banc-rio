package br.com.residencia.contas;

public abstract class Conta {
	
	private String cpf;
	private String agencia;
	private String numero;
	private double saldo;
	
	public abstract boolean sacar(double valor);

	protected abstract void depositar(double valor);

	protected abstract boolean transferir(double valor, Conta destinatario);

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
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}