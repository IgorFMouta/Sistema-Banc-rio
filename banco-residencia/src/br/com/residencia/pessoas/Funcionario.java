package br.com.residencia.pessoas;

public class Funcionario {

	protected String cargo;
	protected String nome;
	protected String cpf;
	protected double salario;
	protected double saldo;

	public double getBonificacao() {
		return this.salario * 0.10 + 1000;
	}

	public double getSalario() {
		return salario;
	}

	public Funcionario(String cargo, String nome, String cpf, double salario) {
		this.cargo = cargo;
		this.saldo = saldo;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public Funcionario() {

	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", nome=" + nome + ", cpf=" + cpf + ", saldo=" + saldo+"]";
	}

}
