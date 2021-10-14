package br.com.residencia.contas;

public class ContaCorrente extends Conta{

	private final String tipo = "Conta Corrente";

<<<<<<< HEAD
	public boolean sacar(double valor) {
		if(this.getSaldo() < valor) {
			//System.out.println("Saldo insuficiente!");
			return false;
=======
	
	sacar()

	protected void depositar(double valor) {
		saldo = getSaldo() + valor;
		System.out.println(saldo);
	}

	protected boolean transferir(double valor, Conta destinatario) {
		if(this.sacar(valor)) {
			destinatario.depositar(valor);
			return true;
>>>>>>> refs/remotes/origin/Rafael
		}
		else {
<<<<<<< HEAD
			 -= valor;
			return true;
=======
			return false;
>>>>>>> refs/remotes/origin/Rafael
		}
	}
	
}