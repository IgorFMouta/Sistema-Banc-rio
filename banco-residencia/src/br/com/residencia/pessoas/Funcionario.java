package br.com.residencia.pessoas;

public class Funcionario extends Usuarios{

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

	public Funcionario(String tipoUsuarios, String nome, String cpf, String senha, Integer agencia, Integer numeroConta, String cargo, Double saldo, Double salario) {
		super(tipoUsuarios, nome, cpf, senha, agencia, numeroConta);
		this.cargo = cargo;
		this.saldo = saldo;
		this.salario = salario;
	}

	public Funcionario() {

	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", nome=" + nome + ", cpf=" + cpf + ", saldo=" + saldo+"]";
	}

}
