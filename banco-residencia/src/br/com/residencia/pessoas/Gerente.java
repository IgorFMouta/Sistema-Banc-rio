package br.com.residencia.pessoas;

public class Gerente extends Funcionario {

	protected int senha;
	protected int numFuncionarios;

	@Override
	public double getBonificacao() {
		return this.salario * 0.15 + 1000 + super.getSalario();
	}

//	public double getBonificacao() {
//		return super.getBonificacao() + 1000 + super.getSalario();
//	}

	public Gerente(String cargo, String nome, String cpf, double salario, int senha, int numFuncionarios) {
		super(cargo, nome, cpf, salario);
		this.senha = senha;
		this.numFuncionarios = numFuncionarios;
	}

	public Gerente() {

	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	public int getSenha() {
		return senha;
	}

	public boolean autenticar(int senha) {
		if (this.senha == senha) {
//			System.out.println("Acesso Permitido!");
			return true;
		} else {
//			System.out.println("Acesso Negado!");
			return false;
		}
	}

}