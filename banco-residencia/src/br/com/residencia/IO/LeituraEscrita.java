package br.com.residencia.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeituraEscrita {

	final static String PATH_BASICO = "./temp/";
	final static String EXTENSAO =".txt";
	
	public static void leitor(String path) throws IOException {
	
		
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));
	
	}
}