package br.com.residencia.contas;

public abstract class Conta {
	
	private String cpf, agencia, numero, tipo;
	private double saldo;
<<<<<<< HEAD

	
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
			destinatario.depositar(valor);
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
=======
	
	//*JULIOOOOOOOOOOOOOOOOO	

	@Override
	public String toString() {
		return "Conta [nome=" + nome + " " + sobrenome + ", numero=" + numero + ", saldo=" + saldo + "]";
>>>>>>> refs/remotes/origin/Rafael
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

<<<<<<< HEAD
	
	
	//Tipo, numero, agencia, saldo
	
	
	
	
	
	
=======
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
	
	private boolean sacar(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}

	protected void depositar(double valor) {
		this.saldo += valor;
	}

	protected boolean transferir(double valor, Conta destinatario) {
		//boolean retirou = this.sacar(valor);
		if(this.sacar(valor)) {
			destinatario.depositar(valor);
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
>>>>>>> refs/remotes/origin/Rafael
}
