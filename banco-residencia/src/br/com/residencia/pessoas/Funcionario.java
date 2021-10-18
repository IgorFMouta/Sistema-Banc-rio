package br.com.residencia.pessoas;

<<<<<<< HEAD
public class Funcionario extends Usuarios{
=======
public class Funcionario extends Usuarios {
>>>>>>> refs/heads/main

	protected String cargo;
	protected String nome;
	protected String cpf;
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

<<<<<<< HEAD
	public Funcionario(String tipoUsuarios, String nome, String cpf, String senha, Integer agencia, Integer numeroConta, String cargo, Double saldo, Double salario) {
		super(tipoUsuarios, nome, cpf, senha, agencia, numeroConta);
		this.cargo = cargo;
=======
	public Funcionario(String cargo,String nome,String sobrenome,String cpf,String senha,Integer agencia,Integer numeroConta, Double saldo,Double salario) {
		super(cargo,nome,sobrenome,cpf,senha,agencia,numeroConta);
>>>>>>> refs/heads/main
		this.saldo = saldo;
		this.salario = salario;
	}

	
	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", nome=" + nome + ", cpf=" + cpf + ", saldo=" + saldo+"]";
	}

}
