package br.com.residencia.contas;

public abstract class ContaCorrente extends Conta{

	private final String tipo = "Conta Corrente";

	double saldo;
	@Override
	public boolean sacar(double valor) {
		if(getSaldo() < valor) {
			return false;
		}
		else {
			saldo = getSaldo() - valor;
			setSaldo(saldo - 0.10);
			return true;
		}
	}

	@Override
	public void depositar(double valor) {
		saldo = getSaldo() + valor;
		setSaldo(saldo - 0.10);
	}
	@Override
	public boolean transferir(double valor, Conta destinatario) {
		if(this.sacar(valor)) {
			destinatario.depositar(valor + 0.20);
			return true;
		}
		else {
			return false;
		}
	}
	

}