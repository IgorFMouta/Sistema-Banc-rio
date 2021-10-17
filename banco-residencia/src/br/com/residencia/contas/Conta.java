package br.com.residencia.contas;

import java.util.HashMap;
import java.util.Map;

public abstract class Conta {
	
	/*private String nome;
	private int numero;
	private String sobrenome;
	private double saldo;
	
<<<<<<< HEAD
	//*JULIOOOOOOOOOOOOOOOOO	
=======

	public boolean sacar(double valor) {
		if(this.saldo < valor) {
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
		if(this.sacar(valor)) {
			destinatario.depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}

	
>>>>>>> refs/remotes/origin/Romulo

	@Override
	public String toString() {
		return "Conta [nome=" + nome + " " + sobrenome + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	*/
	
	private String tipoConta;

	private String cpf;
	private String agencia;
	private String numero;
	private Double saldo;
	private Double SAQUE = 0.1d, DEPOSITO = 0.1d, TRANSFERENCIA = 0.2d;
	
	public static Map<String, Conta> mapaContas = new HashMap<>();
	
	public Conta() {
		super();
	}
	
	public Conta(String TipoConta, String cpf, String agencia, String numero, Double saldo) {
		super();
		this.cpf = cpf;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	

	@Override
	public String toString() {
		return "Conta [cpf=" + cpf + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}


	public abstract boolean sacar(double valor);

	protected abstract boolean depositar(double valor);

	protected abstract boolean transferir(double valor, Conta destinatario);
	
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
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
