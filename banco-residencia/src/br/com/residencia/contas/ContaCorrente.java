package br.com.residencia.contas;

public class ContaCorrente extends Conta{

	private final String tipo = "Conta Corrente";

	double saldo;
	protected boolean sacar(double valor) {
		if(getSaldo() < valor) {
			return false;
		}
		else {
			saldo = getSaldo() - valor;
			setSaldo(saldo - 0.10);
			return true;
		}
	}

	public void depositar(double valor) {
		saldo = getSaldo() + valor;
		setSaldo(saldo - 0.10);
	}

	public boolean transferir(double valor, Conta destinatario) {
		if(this.sacar(valor)) {
			destinatario.depositar(valor + 0.20);
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