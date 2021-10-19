package br.com.residencia.contas;


public class ContaCorrente extends Conta {

	private Integer totalSaques = 0, totalDepositos = 0, totalTransferencias = 0;
	private Double totalTributado1 = 0.1, totalTributado2 = 0.2, totalTributos = 0.0;
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(String tipoConta, String cpf, String agencia, String numero, Double saldo) {
		super(tipoConta, cpf, agencia, numero, saldo);
	
	}

	

	
	@Override
	public String toString() {
		return "Conta " + this.getTipoConta() + "[Numero da Agência = " + this.getAgencia() + "Número da conta = " + 
		this.getNumero() + "Saldo em conta =" + this.getSaldo() + ", CPF = " + this.getCpf() + "]";
	}



	double saldo;
	@Override
	public boolean sacar(double valor) {
		if(getSaldo() < valor || valor < 0) {
			System.out.println("\nNão foi possível realizar a operação!");
			
		}
		else if((getSaldo() - valor - totalTributado1) >= 0) {
				saldo = getSaldo() - valor;
				setSaldo(saldo - totalTributado1);
				totalSaques++;
//				totalTributos += totalTributado1;
				totalTributado1 = totalTributado1 * totalSaques;
				System.out.println("\nOperação realizada com sucesso!");
			return true;
		}
		return false;
	}

	@Override
	public boolean depositar(double valor) {
		if(valor < 0) {
			return false;
		}else {
			if((getSaldo() + totalTributado1) >= 0) {
				saldo = getSaldo() + valor;
				setSaldo(saldo - totalTributado1);
				totalDepositos++;
				totalTributos += totalTributado1;
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
			System.out.println("Não foi possível realizar a operação!");
			return false;
		}
		else {
			destinatario.depositar(valor + totalTributado2);
			totalTransferencias++;
			totalTributado2 = totalTributado2 * totalTransferencias;
			totalTributos += totalTributado2;
			System.out.println("Operação realizada com sucesso!");
		}
		return true;
	}

	public Double getTotalTributado1() {
		return totalTributado1;
	}

	public Double getTotalTributado2() {
		return totalTributado2;
	}

	public Integer getTotalSaques() {
		return totalSaques;
	}

	public Integer getTotalDepositos() {
		return totalDepositos;
	}

	public Integer getTotalTransferencias() {
		return totalTransferencias;
	}

	public Double getTotalTributos() {
		return totalTributos;
	}
	

}