package br.com.residencia.pessoas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public abstract class Usuarios {
	
	protected String papel;
	protected String nome;
	protected String sobrenome;
	protected String cpf;
	protected String senha;
	protected int agencia;
	protected int numeroconta;
	

	public static Map<String, Usuarios> mapaUsuarios = new HashMap<>();
	public static TreeMap<String, Usuarios> OrdenaUsuarios = new TreeMap<>();
	
	
	public Usuarios(String papel,String nome,String sobrenome,String cpf,String senha,int agencia,int numeroconta ) {
		this.papel= papel;
		this.nome= nome;
		this.sobrenome= sobrenome;
		this.cpf= cpf;
		this.senha=senha;
		this.agencia= agencia;
		this.numeroconta= numeroconta;
		
	}

	public Usuarios() {
      super();
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	
	}
	public int compareTo(Usuarios outroUsuario) {

		return this.nome.compareTo(outroUsuario.getNome());
	}

	public String relatorioInformacoes() {

		return "Nome: " + this.nome + "\t CPF: " + this.cpf + "\tAgencia: " + this.agencia;

	}

	@Override
	public String toString() {
		return "Usuario [nome:" + this.nome + ", tipoUsuario:" + this.papel + ", cpf:" + this.cpf + ", senha:"
				+ this.senha + ", agencia:" + this.agencia + ", numeroConta:" + this.numeroconta + "]";
	}

	

}
