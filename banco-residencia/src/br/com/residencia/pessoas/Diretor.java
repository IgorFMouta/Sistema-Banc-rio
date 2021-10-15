package br.com.residencia.pessoas;

public class Diretor extends Gerente {
	
	//a. Relatório com as informações de Nome, CPF e Agência de todos os clientes do sistema em ordem alfabética.
	
	
	class TestOrdenacao {
		
		public static void nomesEmOrdem(String[] args) {
			//nome dos clientes
			//String[] nomes = ordenaArray(new String[]{"Fulano", "Sicrano", "Beltrano", "Barabara", "Samy", "Fabiana" });
		
			
			
			
			
			//Imprime os nomes
			for (int i = 0; i < nomes.length; i++) {
				System.out.println(nomes[i]);
			}
		}
		public static String[] ordenaArray(String[] arrayNomes){
			
			String aux = "";
			
			for (int i = 0; i < arrayNomes.length; i++) {
				
				for (int j = 0; j < arrayNomes.length; j++) {
					String nome1 = arrayNomes[i];
					String nome2 = arrayNomes[j];
					
					if(nome2.charAt(0) > nome1.charAt(0)){
						aux = nome1; 
						arrayNomes[i] = nome2;
						arrayNomes[j] = aux;
					
					}else if(nome2.charAt(0) == nome1.charAt(0)){
						if(nome2.charAt(1) > nome1.charAt(1)){
							aux = nome1;
							arrayNomes[i] = nome2;
							arrayNomes[j] = aux;
						}	
						
					}
				}
		
			}

			return arrayNomes;
		}
	}
}


