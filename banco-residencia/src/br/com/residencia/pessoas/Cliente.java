package br.com.residencia.pessoas;

import java.util.HashMap;
import java.util.Map;

import br.com.residencia.contas.Conta;

public class Cliente extends Usuarios{
	
	String nome;
	String sobrenome;
	String cpf;
	String cargo;
	Integer senha;
	
	
	public Cliente(String cargo, String nome, String sobrenome, String cpf, Integer senha) {
		//super();
		this.cargo = cargo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
		
	}
	

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Integer getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", senha=" + senha + "]";
	}
}
