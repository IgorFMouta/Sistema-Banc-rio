package br.com.residencia.contas;

public class ContaPoupanca extends Conta {

		/*
		 * --- O que fazer? ---
		 * Uma conta poupan�a faz com que seu dinheiro tenha um rendimento extra
		 * � preciso definir uma taxa
		 * O rendimento vai ser calculado por dia, n�o usaremos data!
		 * Uma conta poupan�a amazena o valor do dinheiro que tem nela
		 * Podemos INSERIR mais dinheiro nessa conta e tamb�m SACAR
		 * 
		 */

		private Double DiaRendimento = 0.0;
		private Integer totalSaques = 0, totalDepositos = 0, totalTransferencias = 0;
		private Double totalTributado1 = 0.1, totalTributos = 0.0, totalTributado2 = 0.2;

		public ContaPoupanca() {
			super();
		}

		public ContaPoupanca(String tipoConta, String cpf, String agencia, String numero, Double saldo) {
			super(tipoConta, cpf, agencia, numero, saldo);
		}

		@Override
		public String toString() {
			return "Conta [" + getTipoConta() + ", cpf=" + getCpf() + ", agencia=" + getAgencia() + ", numero=" + 
					getNumero() + ", saldo=" + getSaldo() + "]";
		}
		

		
		//M�todo para calcular o novo saldo
		public void calcularRendimento(double valor, int dias) {
			int contador = 1;
			if(DiaRendimento <= contador) {
				while(DiaRendimento != contador) {
					double taxaRendimento = 0.005;
					this.setSaldo(this.getSaldo() + (valor * taxaRendimento));
					contador++;
					System.out.println(getSaldo());
				}
			}	
		}

		public double getDiaRendimento() {
			return DiaRendimento;
		}
		
		public void setDiaRendimento(double Diarendimento) {
			DiaRendimento = Diarendimento;
		}

		double saldo;
		@Override
		public boolean sacar(double valor) {
			if(getSaldo() < valor || valor < 0) {
				System.out.println("\nN�o foi poss�vel realizar a opera��o!");
				
			}
			else if((getSaldo() - valor - totalTributado1) >= 0) {
					saldo = getSaldo() - valor;
					setSaldo(saldo - totalTributado1);
					totalSaques++;
					totalTributos = totalTributado1 * totalSaques;
					System.out.println("\nOpera��o realizada com sucesso!");
				return true;
			}
			totalTributado1 = totalTributado1 * totalSaques;
			return false;
		}
		@Override
		public boolean depositar(double valor) {
			if(valor < 0) {
				return false;
			}else {
				if((getSaldo() + totalTributado1) >= 0) {
					saldo = getSaldo() + valor;
					setSaldo(saldo - totalTributado1);
					totalDepositos++;
					totalTributos = totalTributado1 * totalDepositos;
				}else {
					System.out.println("N�o foi poss�vel realizar a opera��o!");
				}
				return true;
			}
		}
		@Override
		public boolean transferir(double valor, Conta destinatario) {
			if(getSaldo() < valor || valor < 0) {
				System.out.println("\nN�o foi poss�vel realizar a opera��o!");
				
			}
			else if((getSaldo() - valor - totalTributado1) >= 0) {
					saldo = getSaldo() - valor;
					setSaldo(saldo - totalTributado1);
					totalTributos += totalTributado1 * totalSaques;
					destinatario.depositar(valor + totalTributado1);
					totalTransferencias++;
					
					totalTributos += totalTributado2 * totalTransferencias;
					System.out.println("Opera��o realizada com sucesso!");
					
				return true;
			}
			return false;

		}
}

