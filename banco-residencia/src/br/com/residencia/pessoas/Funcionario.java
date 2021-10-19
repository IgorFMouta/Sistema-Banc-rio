package br.com.residencia.pessoas;

public class Funcionario extends Usuarios {


	protected double salario;
	protected double saldo;

	/*public double getBonificacao() {
		return this.salario * 0.10 + 1000;
	}

	public double getSalario() {
		return salario;
	*/
	public Funcionario() {
	       super();
		}


//	public Usuarios(String tipoUsuarios, String nome, String cpf, Integer senha, Integer agencia, Integer numeroConta)
	public Funcionario(String cargo, String nome, String sobrenome, String cpf, String senha, Integer agencia, Integer numeroConta, Double saldo, Double salario) {
		super(cargo, nome, sobrenome, cpf, senha, agencia, numeroConta);
		this.saldo = saldo;
		this.salario = salario;
	}

	
	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", nome=" + nome + ", cpf=" + cpf + ", saldo=" + saldo+"]";
	}

}

