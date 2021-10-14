package br.com.residencia.contas;

public class ContaCorrente extends Conta{

	private final String tipo = "Conta Corrente";

	
	sacar()

	protected void depositar(double valor) {
		saldo = getSaldo() + valor;
		System.out.println(saldo);
	}

	protected boolean transferir(double valor, Conta destinatario) {
		if(this.sacar(valor)) {
			destinatario.depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
}