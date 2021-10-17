package br.com.residencia.contas;

public class ContaPoupanca extends Conta {

		/*
		 * --- O que fazer? ---
		 * Uma conta poupança faz com que seu dinheiro tenha um rendimento extra
		 * É preciso definir uma taxa
		 * O rendimento vai ser calculado por dia, não usaremos data!
		 * Uma conta poupança amazena o valor do dinheiro que tem nela
		 * Podemos INSERIR mais dinheiro nessa conta e também SACAR
		 * 
		 */
		private String tipoConta = "Poupança";
		private double DiaRendimento;

		public ContaPoupanca() {
			super();
		}

		public ContaPoupanca(String tipoConta, String cpf, String agencia, String numero, Double saldo) {
			super(tipoConta, cpf, agencia, numero, saldo);
		}

		@Override
		public String toString() {
			return "Conta [" + tipoConta + ", cpf=" + getCpf() + ", agencia=" + getAgencia() + ", numero=" + getNumero() + ", saldo=" + getSaldo() + "ContaCorrente" + "]";
		}
		
		public double getDiaRendimento() {
			return DiaRendimento;
		}

		public void setDiaRendimento(double Diarendimento) {
			DiaRendimento = Diarendimento;
		}

		
		//Método para calcular o novo saldo
		public boolean calcularNovoSaldo(double taxaRendimento) {
			int contador = 1;
			if(DiaRendimento >= contador) {
				while(DiaRendimento != contador) {
					this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
					contador++;
				}
				return true;
			}
			return false;	
		}

		double saldo;
		@Override
		public boolean sacar(double valor) {
			if(getSaldo() < valor || valor < 0) {
				return false;
			}
			else {
				saldo = getSaldo() - valor;
				setSaldo(saldo - 0.10);
				return true;
			}
		}

		@Override
		public boolean depositar(double valor) {
			if(valor > 0) {
				saldo = getSaldo() + valor;
				setSaldo(saldo - 0.10);
				return true;
			}else {
				return false;
			}
		}
		@Override
		public boolean transferir(double valor, Conta destinatario) {
			if(this.sacar(valor)) {
				destinatario.depositar(valor + 0.20);
				return true;
			}
			else {
				return false;
			}
		}
}

