package br.com.residencia.pessoas;


public class Diretor extends Gerente {
	


		public Diretor() {
			super();

		}

		public Diretor(String cargo, String nome, String sobrenome, String cpf, String senha, Integer agencia,
				Integer numeroConta, Double saldo, Double salario, Integer numFuncionarios) {
			super(cargo, nome, sobrenome, cpf, senha, agencia, numeroConta, saldo, salario, numFuncionarios);
		}

		@Override
		public String toString() {
			return "Diretor [salario=" + this.salario + ", nome=" + this.nome
					+ ", tipoUsuario=" + this.tipoUsuarios + ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia="
					+ this.agencia + ", numeroConta=" + this.numeroConta + "]\n";
		}

	}

