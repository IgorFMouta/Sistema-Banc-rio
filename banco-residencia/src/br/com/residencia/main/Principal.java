package br.com.residencia.main;

import java.io.IOException;
import java.util.InputMismatchException;
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
	
	public void menuInterativo() throws NullPointerException, InputMismatchException {

		try {

			
			System.out.print("Digite seu CPF: ");
			cpf = sc.next();
			System.out.print("Digite sua senha: ");
			senha = sc.next();

			Usuarios usuario = Usuarios.mapaUsuarios.get(cpf);

			Conta conta = Conta.mapaContas.get(cpf);

			while (usuario == null || !(usuario.getSenha().equalsIgnoreCase(senha))) {
				System.out.println("CPF e/ou Senha incorreto(s)\n\n");

				System.out.print("Digite seu CPF: ");
				cpf = sc.next();
				System.out.print("Digite sua senha: ");
				senha = sc.next();

				usuario = Usuarios.mapaUsuarios.get(cpf);

				conta = Conta.mapaContas.get(cpf);
			}

			limparTela();
			subMenu(usuario, conta);

			imprimirLinha();

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			menuInterativo();
		}
	}
	
	public void subMenu(Usuarios usuario, Conta conta)
			throws NullPointerException, InputMismatchException, IOException {

		try {

			imprimirLinha();
			System.out.println("Bem-vindo(a) ao seu Banco, " + usuario.getNome() + "!\n");
			imprimirLinha();
			System.out.println("Digite o número correspondente à operação desejada:");

			MenuInterativo.menuInterativo(usuario, conta);

		}  catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
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
