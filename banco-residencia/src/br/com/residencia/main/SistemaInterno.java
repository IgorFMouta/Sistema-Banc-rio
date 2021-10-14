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
		
		ContaPoupanca poupanca = new ContaPoupanca();
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		poupanca.setNumero("33355-5");
		poupanca.setAgencia("401");
		
		//informe os dias
		poupanca.setDiaRendimento(120);
		//na conta
		poupanca.setSaldo(50);
		
		
		System.out.println("Saldo atual = " + poupanca.getSaldo());
		if(poupanca.calcularNovoSaldo(0.005)) {
			System.out.println("Rendimento aplicado\nNovo saldo é de = " + decimal.format(poupanca.getSaldo()));
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
	
		
		/*
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
			System.out.println("Operação realizada" + "\n" + usuario.toString());
		}else {
			System.out.println("Saldo insuficiente" + "\n" + usuario.toString());
		}
		
		double valorTransferencia = 600;
		System.out.print("Digite o valor para a transferência: ");
		valorTransferencia = sc.nextDouble();
		if(usuario.transferir(valorTransferencia, destinatario)) {
			System.out.println("Operação realizada" + "\n" + usuario.toString() + "\n" + destinatario.toString());
		}else {
			System.out.println("Saldo insuficiente" + "\n" + usuario.toString() + "\n" + destinatario.toString());
		}
		sc.close();
		*/
	}

}
