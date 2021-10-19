package br.com.residencia.pessoas;

public class Gerente extends Funcionario {



	protected Integer numFuncionarios1;

	public Gerente(String cargo, String nome, String sobrenome, String cpf, String senha, Integer agencia, Integer numeroConta, Double saldo, Double salario, Integer numFuncionarios) {
		super(cargo,nome,sobrenome,cpf,senha,agencia,numeroConta,saldo,salario);

		this.numFuncionarios1 = numFuncionarios;
	}

	public Gerente() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "Cargo [" + cargo + ", nome e sobrenome=" + nome + sobrenome + ", cpf="
				+ cpf + ", senha=" + senha + ", Agência=" + agencia + ", numero da conta=" + numeroConta + 
				", saldo=" + saldo + ", salario=" + salario + ", numero de funcionarios=" + numFuncionarios1 + "]";
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios1;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios1 = numFuncionarios;
	}

	public String getSenha() {
		return senha;
	}


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