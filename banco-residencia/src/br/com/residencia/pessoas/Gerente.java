package br.com.residencia.pessoas;

public class Gerente extends Funcionario {

<<<<<<< HEAD
	protected int numFuncionarios;
=======
	protected String senha;
	protected Integer numFuncionarios;
>>>>>>> refs/heads/main

<<<<<<< HEAD
	public Gerente(String cargo,String nome,String sobrenome,String cpf,String senha,Integer agencia,Integer numeroConta, Double saldo,Double salario, Integer numFuncionarios) {
		super();
=======
//	@Override
//	public double getBonificacao() {
//		return this.salario * 0.15 + 1000 + super.getSalario();
//	}

//	public double getBonificacao() {
//		return super.getBonificacao() + 1000 + super.getSalario();
//	}

	public Gerente(String cargo,String nome,String sobrenome,String cpf,String senha,Integer agencia,Integer numeroConta, Double saldo,Double salario, Integer numFuncionarios) {
		super(cargo,nome,sobrenome,cpf,senha,agencia,numeroConta,saldo,salario);
>>>>>>> refs/heads/main
		this.numFuncionarios = numFuncionarios;
	}

	public Gerente() {

	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	public String getSenha() {
		return senha;
	}

<<<<<<< HEAD

=======
>>>>>>> refs/heads/main
	public boolean autenticar(String senha) {
		if (this.senha == senha) {
//			System.out.prIntegerln("Acesso Permitido!");
			return true;
		} else {
//			System.out.prIntegerln("Acesso Negado!");
			return false;
		}
	}

}