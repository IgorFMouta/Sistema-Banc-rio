package br.com.residencia.pessoas;

import java.util.HashMap;
import java.util.Map;

import br.com.residencia.contas.Conta;

public class Cliente extends Usuarios{
	
	public Cliente() {
		super();
	
	}
	
	public Cliente(String tipoUsuario, String nome, String sobrenome, String cpf, String senha, Integer agencia, Integer numeroConta) {
		super(tipoUsuario, nome, sobrenome, cpf, senha, agencia, numeroConta);
	
	}

	@Override
	public String toString() {
		return "Cliente [tipoUsuarios=" + tipoUsuarios + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf
				+ ", senha=" + senha + ", agencia=" + agencia + ", numeroConta=" + numeroConta + "]";
	}
	
	
}