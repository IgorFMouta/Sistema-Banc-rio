package br.com.residencia.pessoas;

	public class Diretor extends Funcionario {

		public Diretor() {
			super();
		}

		public Diretor(String tipoUsuarios, String nome, String sobrenome, String cpf, String senha, Integer agencia,
				Integer numeroConta, Double saldo, Double salario) {
			super(tipoUsuarios, nome, sobrenome, cpf, senha, agencia, numeroConta, saldo, salario);
		}

		@Override
		public String toString() {
			return "Diretor [salario=" + this.salario + ", nome=" + this.nome
					+ ", tipoUsuario=" + this.tipoUsuarios + ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia="
					+ this.agencia + ", numeroConta=" + this.numeroConta + "]\n";
		}

	}

