package br.com.residencia.main;

import java.io.IOException;
import java.util.Scanner;



import br.com.residencia.contas.Conta;
import br.com.residencia.menu.MenuInterativo;
import br.com.residencia.pessoas.Usuarios;

public class Principal {

	public static Scanner sc = new Scanner(System.in);
	public char operacao;
	public double valor;
	public String cpf;
	public String senha;
	MenuInterativo menuInterativo = new MenuInterativo();
	
	public void menuInterativo() throws IOException{

		try {

			
			System.out.print("Digite seu CPF: ");
			cpf = sc.next();
			System.out.print("Digite sua senha: ");
			senha = sc.next();

			

			Usuarios usuario = Usuarios.mapaUsuarios.get(cpf);

			Conta conta = Conta.mapaContas.get(cpf);
			


			while (usuario == null || !(usuario.getSenha().equalsIgnoreCase(senha))) {


				System.out.println("Cpf e/ou senha incorreto(s)!");
				System.out.print("Digite seu CPF: ");

				System.out.print("Digite sua senha: ");


				usuario = Usuarios.mapaUsuarios.get(cpf);

				conta = Conta.mapaContas.get(cpf);
			}

			limparTela();
			subMenu(usuario, conta);

			imprimirLinha();

		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			menuInterativo();
		}
	}
	
	public void subMenu(Usuarios usuario, Conta conta)
			throws IOException {

		try {


			
			imprimirLinha();
			System.out.println("Bem-vindo(a) ao Banco CH, " + usuario.getNome() + " " + usuario.getSobrenome() + "!\n");

			imprimirLinha();


			MenuInterativo.menuInterativo(usuario, conta);

		}  catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			subMenu(usuario, conta);
		}
	
	MenuInterativo.menuInterativo(usuario, conta);

	}
	
	public void pularLinha() {
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
	}

	public void limparTela() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	public void imprimirLinha() {
		System.out.println("--------------------------------------------------");
	}
	
}
