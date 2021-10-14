package br.com.residencia.contas;

import java.util.Calendar;

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
	
	private double DiaRendimento;

	public double getDiaRendimento() {
		return DiaRendimento;
	}

	public void setDiaRendimento(double Diarendimento) {
		DiaRendimento = Diarendimento;
	}

	//M�todo para calulcar o novo saldo
	public boolean calcularNovoSaldo(double taxaRendimento) {
		int cont = 1;
		//Se o DiaRendimento for menor ou igual contador
		if(DiaRendimento >= cont) {
			while(DiaRendimento != cont) {
				cont++;
				//saldo += saldo * taxaRendimento
				this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			}
		
			
			return true;
		}
		return false;	
	}
		
	

	
}
