package br.com.residencia.main;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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

			
//			System.out.print("Digite seu CPF: ");
			cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
//			System.out.print("Digite sua senha: ");
			senha = JOptionPane.showInputDialog("digite sua senha: ");
			

			Usuarios usuario = Usuarios.mapaUsuarios.get(cpf);

			Conta conta = Conta.mapaContas.get(cpf);
			
			ImageIcon icon = new ImageIcon("C:\\Users\\rafae\\OneDrive\\Imagens\\Saved Pictures\\74a04fc764bd237a148dfe7ce87aa178.jpg");

			while (usuario == null || !(usuario.getSenha().equalsIgnoreCase(senha))) {
				JOptionPane.showMessageDialog(null, "cpf e/ou senha incorreto(s)!", "Erro", JOptionPane.INFORMATION_MESSAGE, icon);;

//				System.out.print("Digite seu CPF: ");
				cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
//				System.out.print("Digite sua senha: ");
				senha = JOptionPane.showInputDialog("digite sua senha: ");

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

			ImageIcon icone = new ImageIcon("C:\\Users\\rafae\\OneDrive\\Imagens\\Saved Pictures\\WhatsApp Image 2021-10-16 at 10.21.30.jpg");
			
			imprimirLinha();
//			System.out.println("Bem-vindo(a) ao Banco CH, " + usuario.getNome() + "!\n");
			JOptionPane.showMessageDialog(null, "Bem-vindo(a) ao Banco CH," + usuario.getNome(), "Entrada", JOptionPane.INFORMATION_MESSAGE, icone);;
			imprimirLinha();
//			System.out.println("Digite o número correspondente à operação desejada:");
			JOptionPane.showInputDialog("Escolha uma opção referente a operação desejada: ");

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
