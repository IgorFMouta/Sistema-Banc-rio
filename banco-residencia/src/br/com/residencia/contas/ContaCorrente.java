package br.com.residencia.contas;

public class ContaCorrente extends Conta{

	private String tipoConta = "Corrente";

	public ContaCorrente(String cpf, String agencia, String numero, double saldo, String tipoConta) {
		super(cpf, agencia, numero, saldo);
		this.tipoConta = tipoConta;
	}

	

	@Override
	public String toString() {
		return "Conta [" + tipoConta + ", cpf=" + getCpf() + ", agencia=" + getAgencia() + ", numero=" + getNumero() + ", saldo=" + getSaldo() + "ContaCorrente" + "]";
	}



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