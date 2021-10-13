package br.com.residencia.main;

import java.util.Scanner;

import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaCorrenteEspecial;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.contas.ContaPoupancaEspecial;

public class Principal {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
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
	}

}
