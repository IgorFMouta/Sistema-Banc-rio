package br.com.residencia.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.enums.ContaTipoEnum;
import br.com.residencia.enums.PessoasTipoEnum;

import br.com.residencia.pessoas.Cliente;
import br.com.residencia.pessoas.Diretor;
import br.com.residencia.pessoas.Gerente;
import br.com.residencia.pessoas.Presidente;
import br.com.residencia.pessoas.Usuarios;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	final static String EXTENSAO = ".txt";
  
	public static void leitor(String path) throws IOException {
		
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));
			//String linha = "";
			
			while (true) {	
				String linha = buffRead.readLine();
				if (linha != null) {
					String[] info = linha.split(";");
					if(info[0].equalsIgnoreCase(ContaTipoEnum.CONTA_CORRENTE.getTipoConta())) {
						ContaCorrente cc = new ContaCorrente(info[0], info[1], info[2], info[3], Double.parseDouble(info[4]));
						Conta.mapaContas.put(info[1], cc);
					}if(info[0].equalsIgnoreCase(ContaTipoEnum.CONTA_POUPANCA.getTipoConta())) {
						ContaPoupanca cp = new ContaPoupanca(info[0], info[1], info[2], info[3], Double.parseDouble(info[4]));
						Conta.mapaContas.put(info[1], cp);

					}if(info[0].equalsIgnoreCase(PessoasTipoEnum.CLIENTE.getTipoUsuario())) {
						Cliente cliente = new Cliente(info[0], info[1], info[2], info[3], info[4], Integer.parseInt(info[5]), Integer.parseInt(info[6]) );
						Usuarios.mapaUsuarios.put(info[3], cliente);
						Usuarios.OrdenaUsuarios.put(info[1], cliente);
					}if(info[0].equalsIgnoreCase(PessoasTipoEnum.GERENTE.getTipoUsuario())) {
						Gerente gerente = new Gerente(info[0], info[1], info[2], info[3], info[4], Integer.parseInt(info[5]), 
								Integer.parseInt(info[6]), Double.parseDouble(info[7]), Double.parseDouble(info[8]), Integer.parseInt(info[9]));
						Usuarios.mapaUsuarios.put(info[3], gerente);
						Usuarios.OrdenaUsuarios.put(info[1], gerente);
					}if(info[0].equalsIgnoreCase(PessoasTipoEnum.DIRETOR.getTipoUsuario())) {
						Diretor diretor = new Diretor(info[0], info[1], info[2], info[3], info[4], Integer.parseInt(info[5]), 
								Integer.parseInt(info[6]), Double.parseDouble(info[7]), Double.parseDouble(info[8]), Integer.parseInt(info[9]));
						Usuarios.mapaUsuarios.put(info[3], diretor);
						Usuarios.OrdenaUsuarios.put(info[1], diretor);
					}if(info[0].equalsIgnoreCase(PessoasTipoEnum.PRESIDENTE.getTipoUsuario())) {
						Presidente presidente = new Presidente(info[0], info[1], info[2], info[3], info[4], Integer.parseInt(info[5]), 
								Integer.parseInt(info[6]), Double.parseDouble(info[7]), Double.parseDouble(info[8]), Integer.parseInt(info[9]));
						Usuarios.mapaUsuarios.put(info[3], presidente);
						Usuarios.OrdenaUsuarios.put(info[1], presidente);

					}
				}else {
						break;					
					}
			}
				buffRead.close();
				
		}catch(FileNotFoundException e) {
				System.out.println("Arquivo não encontrado no local especificado " + PATH_BASICO + path);
			}

		}
	
	public static void escritor(String path) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o nome do arquivo: ");
		String nome = sc.next();

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO));
		String linha = "";

		System.out.println("Escreva algo: ");
		linha = sc.next();
		buffWrite.append(linha + "\n");
		buffWrite.close();

		sc.close();
	}
	
	public static void comprovanteSaque(Conta conta, Double valor) throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_" + conta.getNumero()
		+ "_transacoes";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));
		
		String linha = "*************** SAQUE ***************";
		buffWrite.append(linha + "\n");
		
		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");
		
		linha = "Agência: " + conta.getAgencia();
		buffWrite.append(linha + "\n");
		
		linha = "Conta: " + conta.getNumero();
		buffWrite.append(linha + "\n");
		
		linha = "Valor: R$" + valor;
		buffWrite.append(linha + "\n");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");
		
		linha = "*************** FIM DO SAQUE ***************";
		buffWrite.append(linha + "\n\n");
		
		buffWrite.close();
		}
	
	public static void comprovanteDeposito(Conta conta, double valor) throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_" + conta.getNumero()
				+ "_transacoes";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** DEPÓSITO ***************";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência: " + conta.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumero();
		buffWrite.append(linha + "\n");

		linha = "Valor: R$" + valor;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*************** FIM DO DEPÓSITO ***************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}
	
	public static void comprovanteTransferencia(Conta conta, double valorTransferencia, Conta destino)
			throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_" + conta.getNumero()
				+ "_transacoes";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** TRANSFERÊNCIA REALIZADA ***************";
		buffWrite.append(linha + "\n\n");

		linha = "*********** DADOS DO REMETENTE **********";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência : " + conta.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumero();
		buffWrite.append(linha + "\n");

		linha = "********** DADOS DO DESTINATÁRIO ***********";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + destino.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência: " + destino.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + destino.getNumero();
		buffWrite.append(linha + "\n");

		linha = "***********************************************";
		buffWrite.append(linha + "\n");

		linha = "Valor: R$" + valorTransferencia;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*************** FIM DA TRANSFERÊNCIA ***************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

		// asa partir daqui é o Comprovante do destinatario

		nomeArquivo = destino.getCpf() + "_" + destino.getAgencia() + "_" + destino.getNumero()
				+ "_transacoes";

		buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		linha = "*************** TRANSFERÊNCIA RECEBIDA ***************";
		buffWrite.append(linha + "\n\n");

		linha = "*********** DADOS DO REMETENTE **********";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência : " + conta.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumero();
		buffWrite.append(linha + "\n");

		linha = "********** DADOS DO DESTINATÁRIO ***********";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + destino.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência: " + destino.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + destino.getNumero();
		buffWrite.append(linha + "\n");

		linha = "***********************************************";
		buffWrite.append(linha + "\n");

		linha = "Valor: R$" + valorTransferencia;
		buffWrite.append(linha + "\n");

		simpleDateFormat = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss");
		date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*************** FIM DA TRANSFERÊNCIA ***************";
		buffWrite.append(linha + "\n");

		buffWrite.close();

	}
	
	public static void relatorioTributacaoContaCorrente(Conta conta) throws IOException {

		String nomeArquivo =((ContaCorrente) conta).getTotalSaques() + conta.getCpf() + "_" + conta.getAgencia() + "_" + conta.getNumero()
				+ "_tributacoes";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** TOTAL DE TRIBUTAÇÕES ***************";
		buffWrite.append(linha + "\n\n");

		linha = "Total gasto com transações = R$" + ((ContaCorrente) conta).getTotalTributos();
		buffWrite.append(linha + "\n");

		linha = "Taxa para saque = R$" + ((ContaCorrente) conta).getTotalTributado1();
		buffWrite.append(linha + "\n");

		linha = "Total de saques realizados = " + ((ContaCorrente) conta).getTotalSaques();
		buffWrite.append(linha + "\n\n");

		linha = "Taxa para deposito = R$" + ((ContaCorrente) conta).getTotalTributado1();
		buffWrite.append(linha + "\n");

		linha = "Total de depósitos realizados = " + ((ContaCorrente) conta).getTotalDepositos();
		buffWrite.append(linha + "\n\n");

		linha = "Taxa para tranferência = R$" + ((ContaCorrente) conta).getTotalTributado2();
		buffWrite.append(linha + "\n");

		linha = "Total de transferências realizadas = " + ((ContaCorrente) conta).getTotalTransferencias();
		buffWrite.append(linha + "\n\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "****************************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}
	
	public static void relatorioRendimentoPoupanca(Conta conta, Double valor, Integer dias) throws IOException {

		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_" + conta.getNumero()
				+ "_rendimento";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** SIMULAÇÃO DE RENDIMENTO ***************";
		buffWrite.append(linha + "\n\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência : " + conta.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumero();
		buffWrite.append(linha + "\n");

		linha = "*******************************************************";
		buffWrite.append(linha + "\n\n");

		linha = "Valor simulado = R$" + valor;
		buffWrite.append(linha + "\n");

		linha = "Dias de rendimento = " + dias;
		buffWrite.append(linha + "\n");

		linha = "Total estimado = R$" + (valor + ((valor * 0.005) * dias));
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*******************************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}
	
	public static void relatorioContasPorAgencia(Conta conta) throws IOException {

		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_" + conta.getNumero()
				+ "_contas_por_agencia";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		int totalContas = 0;

		String linha = "********************** INFORMAÇÕES DO RESPONSÁVEL **********************";
		buffWrite.append(linha + "\n\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Agência : " + conta.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "*******************************************************";
		buffWrite.append(linha + "\n\n");

		linha = "*************** TOTAL DE CONTAS NA MESMA AGÊNCIA ***************";
		buffWrite.append(linha + "\n\n");

		for (String cpf : Conta.mapaContas.keySet()) {
			if (Conta.mapaContas.get(cpf).getAgencia().equals(conta.getAgencia())) {

				linha = "CPF: " + Conta.mapaContas.get(cpf).getCpf();
				buffWrite.append(linha + "\n");

				linha = "Agência : " + Conta.mapaContas.get(cpf).getAgencia();
				buffWrite.append(linha + "\n");

				linha = "Conta: " + Conta.mapaContas.get(cpf).getNumero();
				buffWrite.append(linha + "\n");

				totalContas++;

				linha = "**********************************";
				buffWrite.append(linha + "\n");
			}

		}

		linha = "Total de contas: " + totalContas;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "************************************************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}
	
	public static void relatorioTotalClientes(Conta conta, TreeMap<String, Usuarios> OrdenaUsuarios) throws IOException {

		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_" + conta.getNumero()
				+ "_total_clientes";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "************************* TOTAL DE CLIENTES *************************";
		buffWrite.append(linha + "\n\n");

		for (String nome : Usuarios.OrdenaUsuarios.keySet()) {

			linha = Usuarios.OrdenaUsuarios.get(nome).relatorioInformacoes();
			buffWrite.append(linha + "\n");

			linha = "****************************************************************";
			buffWrite.append(linha + "\n");

		}

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*********************************************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}
	
	public static void relatorioTotalCapital(Conta conta, Map<String, Conta> mapaContas) throws IOException {

		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_" + conta.getNumero()
				+ "_total_capital";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		double saldoTotal = 0.0;

		String linha = "************************* TOTAL DE CAPITAL ARMAZENADO *************************";
		buffWrite.append(linha + "\n\n");

		for (String cpf : Conta.mapaContas.keySet()) {

			saldoTotal += Conta.mapaContas.get(cpf).getSaldo();

		}

		linha = "O total de capital armazenado no banco é de: R$" + saldoTotal;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*******************************************************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}
	
	public static void comprovanteSaldo(Conta conta) throws IOException {

		String nomeArquivo = conta.getCpf() + "_" + conta.getAgencia() + "_" + conta.getNumero()
				+ "_comprovanteSaldo";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** SALDO ***************";
		buffWrite.append(linha + "\n");

		linha = "Tipo: " + conta.getTipoConta();
		buffWrite.append(linha + "\n");

		linha = "Agência: " + conta.getAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumero();
		buffWrite.append(linha + "\n");

		linha = "Saldo: R$" + conta.getSaldo();
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Operação realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*************** FIM ***************";
		buffWrite.append(linha + "\n");

		buffWrite.close();

	}

}