package br.com.residencia.pessoas;

public class Cliente extends Usuarios{
	
	public Cliente() {
		super();
	
	}
	
	public Cliente(String cargo, String nome, String sobrenome, String cpf, String senha, Integer agencia, Integer numeroConta) {
		super(cargo, nome, sobrenome, cpf, senha, agencia, numeroConta);
	
	}

	@Override
	public String toString() {
		return "Cliente [cargo=" + cargo + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf
				+ ", senha=" + senha + ", agencia=" + agencia + ", numeroConta=" + numeroConta + "]";
	}
	
	
}