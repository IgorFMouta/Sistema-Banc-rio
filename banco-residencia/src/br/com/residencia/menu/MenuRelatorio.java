package br.com.residencia.menu;

import java.io.IOException;

import br.com.residencia.IO.LeituraEscrita;
import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.enums.ContaTipoEnum;
import br.com.residencia.enums.PessoasTipoEnum;
import br.com.residencia.main.Principal;
import br.com.residencia.pessoas.Usuarios;

public class MenuRelatorio {

	
	Principal principal = new Principal();
	int teste;
	int operacao;
	MenuInterativo menuInterativo = new MenuInterativo();
	
	public static void menuRelatorio(Integer idUsuario, Usuarios usuarios, Conta conta)
			throws IOException {

		Principal principal = new Principal();

		principal.pularLinha();

		if (conta.getTipoConta().equalsIgnoreCase(ContaTipoEnum.CONTA_CORRENTE.getTipoConta())) {

			System.out.println("[1]\tTributos da conta corrente");

		} else {

			
			System.out.println("[1]\tSimulacao de rendimento da poupança");

		}
		if (idUsuario >= 2) {
			System.out.println("[2]\tNúmero de contas em sua agencia");
			if (idUsuario >= 3) {
				System.out.println("[3]\tInformações de Nome, CPF e Agência de todos os clientes");
				if (idUsuario >= 4) {
					System.out.println("[4]\tValor total do capital armazenado");
				}
			}
		}
		System.out.println("[5]\tVoltar");
		imprimeLinhaHorizontal();

		System.out.print("Digite a opção desejada: ");
		int operacao = Principal.sc.nextInt();

		principal.pularLinha();

		switch (operacao) {

		case 1:

			if (conta.getTipoConta().equalsIgnoreCase(ContaTipoEnum.CONTA_CORRENTE.getTipoConta())) {

//				ContaCorrente cc = new ContaCorrente();
				System.out.println("O total gasto com operações foi de R$" + String.format("%.2f", ((ContaCorrente) conta).getTotalTributos()));
				System.out.println("O valor cobrado para cada saque é de R$0.10");
				System.out.println("Total de saques realizados: " + ((ContaCorrente) conta).getTotalSaques());
				System.out.println("O valor cobrado para cada deposito é de R$0.10");
				System.out.println("Total de depósitos realizados: " + ((ContaCorrente) conta).getTotalDepositos());
				System.out.println("O valor cobrado para cada tranferência é de R$0.20");
				System.out.println("Total de transferências realizadas: " + ((ContaCorrente) conta).getTotalTransferencias());

				LeituraEscrita.relatorioTributacaoContaCorrente(conta);

			} else {

				int dias;
				double valor;

				ContaPoupanca poupanca = new ContaPoupanca();
				
				System.out.println("Digite o valor que deseja usar para a simulação: ");
				valor = Double.parseDouble(Principal.sc.next());

				System.out.println("Digite o número de dias para a simulação: ");
				dias = Principal.sc.nextInt();

				poupanca.calcularRendimento(valor, dias);

				LeituraEscrita.relatorioRendimentoPoupanca(conta, valor, dias);

			}

			selecaoRelatorio(conta, usuarios);

			break;

		case 2:

			int total = 0;
			for (String cpf : Conta.mapaContas.keySet()) {
				if (Conta.mapaContas.get(cpf).getAgencia().equals(conta.getAgencia())) {

					System.out.println(Conta.mapaContas.get(cpf));
					total++;
				}

			}
			System.out.println("Total de contas: " + total);

			LeituraEscrita.relatorioContasPorAgencia(conta);

			selecaoRelatorio(conta, usuarios);

			break;

		case 3:

			for (String nome : Usuarios.OrdenaUsuarios.keySet()) {

				System.out.println(Usuarios.OrdenaUsuarios.get(nome).relatorioInformacoes());

			}

			LeituraEscrita.relatorioTotalClientes(conta, Usuarios.OrdenaUsuarios);

			selecaoRelatorio(conta, usuarios);

			break;

		case 4:

			double saldoTotal = 0.0;
			for (String cpf : Conta.mapaContas.keySet()) {

				saldoTotal += Conta.mapaContas.get(cpf).getSaldo();

			}

			System.out.println("O total de capital armazenado no banco é de: R$" + String.format("%.2f", saldoTotal));

			LeituraEscrita.relatorioTotalCapital(conta, Conta.mapaContas);

			selecaoRelatorio(conta, usuarios);

			break;

		case 5:

			principal.limparTela();
			MenuInterativo.menuInterativo(usuarios, conta);
			break;

		default:

			principal.pularLinha();
			System.out.println("Opção inválida!");
			selecaoRelatorio(conta, usuarios);

		}

	}

	public static void selecaoRelatorio(Conta conta, Usuarios usuario)
			throws IOException {

		if (usuario.getCargo().equalsIgnoreCase(PessoasTipoEnum.CLIENTE.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(PessoasTipoEnum.CLIENTE.getIdTipoUsuario(), usuario, conta);
		} else if (usuario.getCargo().equalsIgnoreCase(PessoasTipoEnum.GERENTE.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(PessoasTipoEnum.GERENTE.getIdTipoUsuario(), usuario, conta);
		} else if (usuario.getCargo().equalsIgnoreCase(PessoasTipoEnum.DIRETOR.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(PessoasTipoEnum.DIRETOR.getIdTipoUsuario(), usuario, conta);
		} else if (usuario.getCargo().equalsIgnoreCase(PessoasTipoEnum.PRESIDENTE.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(PessoasTipoEnum.PRESIDENTE.getIdTipoUsuario(), usuario, conta);
		}
	}

	public static void imprimeLinhaHorizontal() {
		System.out.println("--------------------------------------------------");
	}
}
