package br.com.residencia.pessoas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

<<<<<<< HEAD
public abstract class Usuarios implements Comparable<Usuarios> {

	protected String tipoUsuarios;
	protected String nome;
	protected String cpf;
	protected String senha;
	protected Integer agencia;
	protected Integer numeroConta;

	public static Map<String, Usuarios> mapaUsuarios = new HashMap<>();
	public static TreeMap<String, Usuarios> OrdenaUsuarios = new TreeMap<>();

	public Usuarios() {

	}

	public Usuarios(String tipoUsuarios, String nome, String cpf, String senha, Integer agencia, Integer numeroConta) {
		this.nome = nome;
		this.tipoUsuarios = tipoUsuarios;
		this.cpf = cpf;
		this.senha = senha;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}

	public String getTipoUsuarios() {
		return this.tipoUsuarios;
	}

	public void setTipoUsuarios(String tipoUsuarios) {
		this.tipoUsuarios = tipoUsuarios;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getAgencia() {
		return this.agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	@Override
	public int compareTo(Usuarios outroUsuarios) {

		return this.nome.compareTo(outroUsuarios.getNome());
	}

	public String relatorioInformacoes() {

		return "Nome: " + this.nome + "\t CPF: " + this.cpf + "\tAgencia: " + this.agencia;

	}

	@Override
	public String toString() {
		return "Usuarios [nome=" + this.nome + ", tipoUsuarios=" + this.tipoUsuarios + ", cpf=" + this.cpf + ", senha="
				+ this.senha + ", agencia=" + this.agencia + ", numeroConta=" + this.numeroConta + "]";
	}
=======

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

	
>>>>>>> refs/heads/main

}
