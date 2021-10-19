package br.com.residencia.pessoas;

public class Presidente extends Diretor{

	Presidente(){
		super();
	}
	
	public Presidente(String cargo, String nome, String sobrenome, String cpf, String senha, Integer agencia, Integer numeroConta, Double saldo, Double salario, Integer numFuncionarios){
		super(cargo, nome, sobrenome, cpf, senha, agencia, numeroConta, saldo, salario, numFuncionarios);
	}

	@Override
	public String toString() {
		return "Presidente [numFuncionarios =" + numFuncionarios + ", senha =" + senha + ", numFuncionarios1 ="
				+ numFuncionarios1 + ", cargo =" + cargo + ", nome =" + nome + ", cpf =" + cpf + ", salario =" + salario
				+ ", saldo =" + saldo + ", cargo =" + cargo + ", sobrenome =" + sobrenome + ", agencia ="
				+ agencia + ", numeroConta =" + numeroConta + "]";
	}
}
