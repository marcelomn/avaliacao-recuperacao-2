import java.util.Scanner;
/**
 * 
 * @author Nicolas Maffra
 * @author Marcelo Mendes
 * @version 1.1
 */
public class manipulaLinha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		boolean continuar = true;

		while (continuar) {
			System.out.println("Digite uma frase e tecle [ENTER]:");
			String fraseEntrada = entrada.nextLine();
			System.out.println(manipulaLinha.contador(fraseEntrada));
			
			System.out.println("");
			System.out.println("------------------------");
			System.out.println("Desejea continuar? [s/n]");
			String r = entrada.nextLine();
			if (r.equals("s")) {
				System.out.println("");
				continuar = true;
			} else {
				continuar = false;
			}
		}
		
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("fim :)");
	}

	/**
	 * verifica frase e altera a ordem das palavras em ordem crescente por quantidade de caracteres
	 * 
	 * @param frase		traz a frase digitada
	 * @param palavras	separa as palavras por espaço
	 * @return frase montada no formato da menor palavra para a maior (ordem crescente)
	 */
	public static String contador(String frase) {
		String[] palavras = frase.split(" ");
		
		/*
		// BUBBLE SORT
		 for (int i = 0; i < palavras.length; i++) {
			 for (int x = 0; x < palavras.length - 1 - i; x++) {
				 if (palavras[x].length() > palavras[x + 1].length()) {
					 String coringa = palavras[x];
					 palavras[x] = palavras[x + 1];
					 palavras[x + 1] = coringa;
				 }
			 }
		 }*/
		
		//INSERTION SORT
		//for inicial, percorrendo todo o vetor de palavras
		for (int i = 1; i < palavras.length; i++) {
			// nova string recebendo a primeira palavra
			String a = palavras[i];
			int j; // instancia o j
			//for iniciando em 'j-1' e verificando se é maior ou igual 0,
			// E que a posição 'j' no vetor de palavras seja maior que 'a'
			for (j = i - 1; j >= 0 && palavras[j].length() > a.length(); j--) {
				palavras[j + 1] = palavras[j];
				palavras[j] = a;
			}
		}
		 
		 /**
		  * 
		  */
		String fraseMontada = palavras[0];
		for (int y = 1; y < palavras.length; y++) {
			fraseMontada += (" " + palavras[y]);
		}

		return fraseMontada;
	}
}
