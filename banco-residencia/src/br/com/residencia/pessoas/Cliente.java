package br.com.residencia.pessoas;

public class Cliente {
	String nome;
	String sobrenome;
	String cpf;
	int senha;
	
	
	public Cliente(String nome, String sobrenome, String cpf, int senha) {
		//super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getSenha() {
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
