package br.com.residencia.main;

import java.text.DecimalFormat;
import java.util.Scanner;
import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaCorrenteEspecial;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.contas.ContaPoupancaEspecial;

public class SistemaInterno {

	public static void main(String[] args) {
		
		
		// ================ TESTE CONTA POUPANÇA =========================
		
		//INSTANCIAS
		ContaPoupanca poupanca = new ContaPoupanca();
		DecimalFormat decimal = new DecimalFormat("0.00");
		Scanner ler = new Scanner(System.in);
		
		//ATRIBUTOS
		int opcao, dias;
		int opcaoSimula;
		boolean simula = true;
		
		poupanca.setSaldo(50);
		
		//MENSAGEM INICIAL
		System.out.println("########### Conta Poupança ###########\n" 
		+ " \n------------- Informações da conta ------------"
		+ "\nNome = Ronaldo"
		+ "\nN° Conta = 05650-5"
		+ "\nN° Agencia = 401"
		+ "\nSaldo atual = R$" + decimal.format(poupanca.getSaldo())
		+ "\n\n==================================================");
		
		
		//INTEIRAÇÃO
		System.out.println("\nDeseja fazer uma simulação de rendimento?"
				+ "\n(1) - SIM\n(2) - ENCERRAR \n(3) - VOLTAR A TRANSAÇÕES");
		opcao = ler.nextInt();		
	
		
		//ESCOLHA CASO
		switch (opcao) {
		case 1: {		
			while(simula == true) {
				System.out.println("########### Simulação de Rendimento ###########\n"
						+ "\nInforme a quantidade de dias que pretende simular: ");
				dias = ler.nextInt();
				poupanca.setDiaRendimento(dias);
				if(poupanca.calcularNovoSaldo(0.0005)) {	
					System.out.println("--------- " + dias + " dias --------- " 
				    + "\nO seu saldo simulado seria = R$" + decimal.format(poupanca.getSaldo()));
				}		
				simula = false;
				System.out.println("Deseja simular novamente? \n(1) - SIM \n(2) - NÃO");
				opcaoSimula = ler.nextInt();
				if(opcaoSimula == 1) {
					poupanca.setSaldo(50);
					simula = true;
				}
				
				if(opcaoSimula == 2) {
					System.out.println("Adeus!");
				}
			}	
			break;
			}
		
		}
		
		
	
	
	
		
	}

}