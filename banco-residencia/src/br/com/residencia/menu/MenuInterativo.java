package br.com.residencia.menu;

import java.io.IOException;
import java.util.InputMismatchException;

import br.com.residencia.IO.LeituraEscrita;
import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.enums.PessoasTipoEnum;
import br.com.residencia.main.Principal;
import br.com.residencia.pessoas.Usuarios;

public class MenuInterativo {

	double valor;
	static String cpf;
	int escolha;
	
	public static void menuInterativo(Usuarios usuario, Conta conta)
			throws IOException {
		Principal principal = new Principal();
		ContaCorrente cc = new ContaCorrente();
		
		System.out.println("=========================================================================================================\n"
				+ "+ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  +\r\n"
				+ "+ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:              @@@@#              :@@@@@@@  +\r\n"
				+ "+ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#                                      :@@@@@  +\r\n"
				+ "+ @@@@       @@@@@    @@@@   !@#  @@#      @@@      !@@@@         ########### ####   ####        :@@@@  +\r\n"
				+ "+ @@@@   @@   @@@      @@@    ##  @@  :@@  :@:  @@#  @@@@!        ####        ####   ####        !@@@@  +\r\n"
				+ "+ @@@@       @@@@  $$  @@@  #  #  @@  :@@@@@@:  @@#  @@@@@!       ####        ###########       :@@@@@  +\r\n"
				+ "+ @@@@   @@@   @        @@  #@    @@  :@@@  @:  @@#  @@@@@@#      ########### ####   ####      :@@@@@@  +\r\n"
				+ "+ @@@@        @@   @@   @@  #@#   @@@     .@@@      @@@@@@@@@@                              :@@@@@@@@@  +\r\n"
				+ "+ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                        :@@@@@@@@@@@@  +\r\n"
				+ "+ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                :@@@@@@@@@@@@@@@@  +\r\n"
				+ "+ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!       :@@@@@@@@@@@@@@@@@@@@  +\r\n"
				+ "+ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@@@@@  +\r\n"
				+ "+ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  +\r\n"
				+ "=========================================================================================================");
		
		try {
			
			principal.pularLinha();
			System.out.println("[1]\tSaque");
			System.out.println("[2]\tDeposito");
			System.out.println("[3]\tTransferência");
			System.out.println("[4]\tSaldo");
			System.out.println("[5]\tRelatório");
			System.out.println("[6]\tSair");
			principal.imprimirLinha();
			
			System.out.print("Escolha uma opção para seguir: ");
			int opcao = principal.sc.nextInt();
			Double valor;
			
			switch(opcao) {
			case 1:
				System.out.print("Digite o valor que gostaria de retirar: ");
				valor = Double.parseDouble(principal.sc.next());
				
				conta.sacar(valor);
				
				LeituraEscrita.comprovanteSaque(conta, valor);
				
				principal.pularLinha();
				break;
			
			case 2:
				System.out.print("Digite o valor apra deposito: ");
				valor = Double.parseDouble(principal.sc.next());
				
				conta.depositar(valor);
				
				LeituraEscrita.comprovanteDeposito(conta, valor);
				
				principal.pularLinha();
				break;
				
			case 3:
				System.out.print("Digite o cpf para o qual deseja transferir: ");
				cpf = principal.sc.next();
				Conta destinatario = Conta.mapaContas.get(cpf);
				
				while(destinatario == null) {
					System.out.println("Cpf não encontrado no sistema!\n\n");
					System.out.print("Digite o cpf para o qual deseja transferir: ");
					cpf = principal.sc.next();
					destinatario = Conta.mapaContas.get(cpf);
				}
				System.out.println("Informe o valor a ser transferido: ");
				valor = Double.parseDouble(principal.sc.next());
				
				conta.transferir(valor, destinatario);
				
				LeituraEscrita.comprovanteTransferencia(conta, valor, destinatario);
				
				principal.pularLinha();
				break;
				
			case 4:
				System.out.println("Seu saldo é de: R$" + String.format("%,2f", conta.getSaldo()));
				
				principal.pularLinha();
				break;
				
			case 5:
				if (usuario.getTipoUsuarios().equalsIgnoreCase(PessoasTipoEnum.CLIENTE.getTipoUsuario())) {
					MenuRelatorio.menuRelatorio(PessoasTipoEnum.CLIENTE.getIdTipoUsuario(), usuario, conta);
				} else if (usuario.getTipoUsuarios().equalsIgnoreCase(PessoasTipoEnum.GERENTE.getTipoUsuario())) {
					MenuRelatorio.menuRelatorio(PessoasTipoEnum.GERENTE.getIdTipoUsuario(), usuario, conta);
				} else if (usuario.getTipoUsuarios().equalsIgnoreCase(PessoasTipoEnum.DIRETOR.getTipoUsuario())) {
					MenuRelatorio.menuRelatorio(PessoasTipoEnum.DIRETOR.getIdTipoUsuario(), usuario, conta);
				} else if (usuario.getTipoUsuarios().equalsIgnoreCase(PessoasTipoEnum.PRESIDENTE.getTipoUsuario())) {
					MenuRelatorio.menuRelatorio(PessoasTipoEnum.PRESIDENTE.getIdTipoUsuario(), usuario, conta);
				}
				break;
				
			case 6:
				
				principal.menuInterativo();
				
				break;
			
			default:
				
				System.out.println("Essa opção não é válida!");
				
			}
			menuInterativo(usuario, conta);

		}  catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			menuInterativo(usuario, conta);
		}
	}

			
}

