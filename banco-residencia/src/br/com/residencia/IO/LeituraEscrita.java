package br.com.residencia.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.enums.ContaTipoEnum;
import br.com.residencia.enums.PessoasTipoEnum;
<<<<<<< HEAD
import br.com.residencia.pessoas.Cliente;
import br.com.residencia.pessoas.Diretor;
import br.com.residencia.pessoas.Gerente;
import br.com.residencia.pessoas.Presidente;
=======
import br.com.residencia.pessoas.Gerente;
>>>>>>> refs/heads/main
import br.com.residencia.pessoas.Usuarios;

public class LeituraEscrita {

	static final String PATH_BASICO = ".\\banco-residencia\\temp\\";
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
<<<<<<< HEAD
					}if(info[0].equalsIgnoreCase(PessoasTipoEnum.CLIENTE.getTipoUsuario())) {
						Cliente cliente = new Cliente(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]));
						Usuarios.mapaUsuarios.put(info[0], cliente);
						Usuarios.OrdenaUsuarios.put(info[0], cliente);
					}if(info[0].equalsIgnoreCase(PessoasTipoEnum.GERENTE.getTipoUsuario())) {
						Gerente gerente = new Gerente(info[0], info[1], info[2], Double.parseDouble(info[3]), Integer.parseInt(info[4]), Integer.parseInt(info[5]));
						Usuarios.mapaUsuarios.put(info[0], gerente);
						Usuarios.OrdenaUsuarios.put(info[0], gerente);
					}if(info[0].equalsIgnoreCase(PessoasTipoEnum.DIRETOR.getTipoUsuario())) {
						Diretor diretor = new Diretor(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]));
						Usuarios.mapaUsuarios.put(info[2], diretor);
						Usuarios.OrdenaUsuarios.put(info[0], diretor);
					}if(info[0].equalsIgnoreCase(PessoasTipoEnum.PRESIDENTE.getTipoUsuario())) {
						Presidente presidente = new Presidente(info[0], info[1], info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]));
						Usuarios.mapaUsuarios.put(info[2], presidente);
						Usuarios.OrdenaUsuarios.put(info[0], presidente);
=======
			//		}if(info[0].equalsIgnoreCase(PessoasTipoEnum.GERENTE.getTipoUsuario())) {
				//		Gerente gere = new Gerente(info[0], info[1], info[3],info[4],info[5], Integer.parseInt(info[6], Integer.parseInt(info[7], 
				//				Double.parseDouble(info[8], Double.parseDouble(info[9])))));
>>>>>>> refs/heads/main
					}
					else {
						break;					
					}
<<<<<<< HEAD
				}
				buffRead.close();
			
			} 
		}catch(FileNotFoundException e) {
=======
			}
			buffRead.close();
		  }
	} catch(FileNotFoundException e) {
>>>>>>> refs/heads/main
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

}