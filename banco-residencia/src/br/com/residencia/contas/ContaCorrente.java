package br.com.residencia.contas;

public class ContaCorrente extends Conta{

	private String tipo;

	public boolean sacar(double valor) {
		if(this.getSaldo() < valor) {
			//System.out.println("Saldo insuficiente!");
			return false;
		}
		else {
			 -= valor;
			return true;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
}