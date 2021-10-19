package br.com.residencia.pessoas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public abstract class Usuarios implements Comparable<Usuarios> {

	protected String cargo;
	protected String nome;
	protected String sobrenome;
	protected String cpf;
	protected String senha;
	protected Integer agencia;
	protected Integer numeroConta;

	public static Map<String, Usuarios> mapaUsuarios = new HashMap<>();
	public static TreeMap<String, Usuarios> OrdenaUsuarios = new TreeMap<>();

	public Usuarios() {
		super();
	}

	public Usuarios(String cargo, String nome, String sobrenome, String cpf, String senha, Integer agencia, Integer numeroConta) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cargo = cargo;
		this.cpf = cpf;
		this.senha = senha;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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

	public String getSobrenome() {
		return sobrenome;
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
		return "Usuarios [nome=" + this.nome + ", cargo=" + this.cargo + ", cpf=" + this.cpf + ", senha="
				+ this.senha + ", agencia=" + this.agencia + ", numeroConta=" + this.numeroConta + "]";
	}


}
