package br.com.residencia.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
					//ENUM
					System.out.println(info[0] + "\n" + info[1] + "\n" + info[2] + "\n" + info[3] + "\n" 
					+ info[4] + "\n" + info[5]);
				} else {
					break;					
				}
			}
			buffRead.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado no local especificado " + PATH_BASICO + path);
		}

	}
}