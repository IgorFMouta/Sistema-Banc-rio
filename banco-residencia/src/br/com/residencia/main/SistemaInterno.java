package br.com.residencia.main;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

import br.com.residencia.IO.LeituraEscrita;
import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.pessoas.Cliente;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		
	/*	Cliente cliente1 = new Cliente(" Luciano"," Alencar"," 087.987.957-10", 1256);
		System.out.println(cliente1.toString());*/
		
		
		LeituraEscrita.leitor("entradaDados.txt");
		
		
		
	/*	ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial();
		ContaPoupancaEspecial contaPoupancaEspecial = new ContaPoupancaEspecial();
		
		
		
		
		
		
		Conta usuario = new Conta();
		usuario.setNome("Rafael");
		usuario.setSobrenome("Baltar");
		usuario.setNumero(001);
		usuario.depositar(15000);
		System.out.println(usuario.toString());
		
		Conta destinatario = new Conta();
		destinatario.setNome("Julio");
		destinatario.setSobrenome("Smith");
		destinatario.setNumero(001);
		destinatario.depositar(1000);
		System.out.println(usuario.toString());		
	
		double valorSaque;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor para o saque: ");
		valorSaque = sc.nextDouble();
		if(usuario.sacar(valorSaque)) {
			System.out.println("Opera��o realizada" + "\n" + usuario.toString());
		}else {
			System.out.println("Saldo insuficiente" + "\n" + usuario.toString());
		}
		
		double valorTransferencia = 600;
		System.out.print("Digite o valor para a transfer�ncia: ");
		valorTransferencia = sc.nextDouble();
		if(usuario.transferir(valorTransferencia, destinatario)) {
			System.out.println("Opera��o realizada" + "\n" + usuario.toString() + "\n" + destinatario.toString());
		}else {
			System.out.println("Saldo insuficiente" + "\n" + usuario.toString() + "\n" + destinatario.toString());
		}
		sc.close();*/
		
//		ContaCorrente contaRafael = new ContaCorrente();
//		contaRafael.setCpf("16789");
//		contaRafael.setNumero("12345");
//		contaRafael.setAgencia("001");
//		contaRafael.depositar(500);
//		
//		ContaCorrente contaIgor = new ContaCorrente();
//		contaIgor.setCpf("16569");
//		contaIgor.setNumero("12435");
//		contaIgor.setAgencia("001");
//		contaIgor.depositar(1000);
//		
//		contaRafael.transferir(250, contaIgor);
//		JOptionPane.showMessageDialog(null,  "\tBanco CH \n'N�o contavam com minha ast�cia' \nEsses s�o os saldos ap�s a transferencia \n" 
//		+ "Conta Rafael " + String.format("%.1f", contaRafael.getSaldo()) + "\n Conta Igor " + String.format("%.1f", contaIgor.getSaldo()));
		
		// ================ TESTE CONTA POUPAN�A =========================
		
				//INSTANCIAS
//				ContaPoupanca poupanca = new ContaPoupanca();				DecimalFormat decimal = new DecimalFormat("0.00");
//				Scanner ler = new Scanner(System.in);
//				
//				//ATRIBUTOS
//				int opcao, dias;
//				int opcaoSimula;
//				boolean simula = true;
//				
//				poupanca.setSaldo(50);			
//				//MENSAGEM INICIAL
//				System.out.println("########### Conta Poupan�a ###########\n" 
//				+ " \n------------- Informa��es da conta ------------"
//				+ "\nNome = Ronaldo"
//				+ "\nN� Conta = 05650-5"
//				+ "\nN� Agencia = 401"
//				+ "\nSaldo atual = R$" + decimal.format(poupanca.getSaldo())
//				+ "\n\n==================================================");
//				
//				
//				//INTERA��O
//				System.out.println("\nDeseja fazer uma simula��o de rendimento?"
//						+ "\n(1) - SIM\n(2) - ENCERRAR \n(3) - VOLTAR A TRANSA��ES");
//				opcao = ler.nextInt();		
//			
//				
//				//ESCOLHA CASO
//				switch (opcao) {
//				case 1: {		
//					while(simula == true) {
//							System.out.println("########### Bem vindo ao banco CH ###########\n"
//								+ "\nInforme a opera��o que deseja realizar: ");
//							dias = ler.nextInt();
//							poupanca.setDiaRendimento(dias);
//							if(poupanca.calcularNovoSaldo(0.0005)) {	
//							System.out.println("--------- " + dias + " dias --------- " 
//						    + "\nO seu saldo simulado seria = R$" + decimal.format(poupanca.getSaldo()));
//						}		
//							simula = false;
//							System.out.println("Deseja simular novamente? \n(1) - SIM \n(2) - N�O");
//							opcaoSimula = ler.nextInt();
//							if(opcaoSimula == 1) {
//							poupanca.setSaldo(50);
//							simula = true;
//						}
//						
//						if(opcaoSimula == 2) {
//							System.out.println("Adeus!");
//						}
//					}	
//					break;
//					}
		
//				}
	}

}
