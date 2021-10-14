package br.com.residencia.contas;

public class ContaCorrente extends Conta{

	private final String tipo = "Conta Corrente";

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
			depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}
}