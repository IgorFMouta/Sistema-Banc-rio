package br.com.residencia.contas;

import br.com.residencia.IO.LeituraEscrita;

public class ContaCorrente extends Conta {

	private Integer totalSaques = 0, totalDepositos = 0, totalTransferencias = 0;
	private Double totalTributado1 = 0.1;
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(String tipoConta, String cpf, String agencia, String numero, Double saldo) {
		super(tipoConta, cpf, agencia, numero, saldo);
	
	}

	

	@Override
	public String toString() {
		return "Conta Corrente [Numero da Agência = " + this.getAgencia() + "Número da conta = " + 
		this.getNumero() + "Saldo em conta =" + this.getSaldo() + ", CPF = " + this.getCpf() + "]";
	}



	double saldo;
	@Override
	public boolean sacar(double valor) {
		if(getSaldo() < valor || valor < 0) {
			return false;
		}
		else {
			if((getSaldo() - valor - totalTributado1) >= 0) {
				saldo = getSaldo() - valor;
				setSaldo(saldo - totalTributado1);
				totalSaques++;
			}else {
				System.out.println("Não foi possível realizar a operação!");
			}
			totalTributado1 = totalTributado1 * totalSaques;
			return true;
		}
	}

	@Override
	public boolean depositar(double valor) {
		if(valor < 0) {
			return false;
		}else {
			if((getSaldo() + totalTributado1) >= 0) {
				saldo = getSaldo() + valor;
				setSaldo(saldo - 0.10);
				totalDepositos++;
			}else {
				System.out.println("Não foi possível realizar a operação!");
			}
			this.totalTributado1 = this.totalTributado1 * this.totalDepositos;
			return true;
		}
	}
	@Override
	public boolean transferir(double valor, Conta destinatario) {
		if(this.sacar(valor) == false) {
			return false;
		}
		else {
			destinatario.depositar(valor + 0.20);
			totalTransferencias++;
			return true;
		}
	}
	

}