package br.com.residencia.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
					
					System.out.println(info[0] + "\t" + info[1] + "\t" + info[2] + "\t" + info[3] + "\t" 
					+ info[4]);
				} else {
					break;					
				}
			}
			buffRead.close();
			
		} catch(FileNotFoundException e) {
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

}