package br.com.residencia.main;

import java.io.IOException;

import java.util.InputMismatchException;


import br.com.residencia.IO.LeituraEscrita;


public class SistemaInterno {

	public static void main(String[] args) 
				throws IOException, InputMismatchException, NullPointerException {
			Principal principal = new Principal();

			LeituraEscrita.leitor("entradaDados.txt");

			principal.menuInterativo();

		}

}
