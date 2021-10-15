package br.com.residencia.contas;

public abstract class Conta {
	
	/*private String nome;
	private int numero;
	private String sobrenome;
	private double saldo;
	
	//*JULIOOOOOOOOOOOOOOOOO	

	@Override
	public String toString() {
		return "Conta [nome=" + nome + " " + sobrenome + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
// heheh
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
