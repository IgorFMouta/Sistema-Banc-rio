package br.com.residencia.contas;

public class ContaPoupanca extends Conta {
	
		public ContaPoupanca() {
			
		}
	
		public ContaPoupanca(String cpf, String agencia, String numero, double saldo) {
		super(cpf, agencia, numero, saldo);
		}

		/*
		 * --- O que fazer? ---
		 * Uma conta poupan�a faz com que seu dinheiro tenha um rendimento extra
		 * � preciso definir uma taxa
		 * O rendimento vai ser calculado por dia, n�o usaremos data!
		 * Uma conta poupan�a amazena o valor do dinheiro que tem nela
		 * Podemos INSERIR mais dinheiro nessa conta e tamb�m SACAR
		 * 
		 */
		private final String tipo = "Conta Poupan�a";
		private double DiaRendimento;


		public double getDiaRendimento() {
			return DiaRendimento;
		}

		public void setDiaRendimento(double Diarendimento) {
			DiaRendimento = Diarendimento;
		}

		
		//M�todo para calcular o novo saldo
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

		@Override
		public boolean sacar(double valor) {
			return false;
		}

		@Override
		protected void depositar(double valor) {
			
		}

		@Override
		protected boolean transferir(double valor, Conta destinatario) {
			return false;
		}
			
		
		
		

		
}

