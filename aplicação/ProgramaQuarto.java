package aplicação;
import java.util.Scanner;

import entidades.Quarto;

public class ProgramaQuarto{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Sejam bem-vindos!! existem 10 quartos disponíveis");
		System.out.println("Quantos quartos serão alocados? ");
		
		int qtdEstudantes= in.nextInt();
		
		Quarto[] h = new Quarto[qtdEstudantes];
		
		for (int v = 0; v < h.length; v++) {
		System.out.println("Qual quarto você vai escolher? " + (v+1) + "°" + "quarto");
		int quarto = in.nextInt();
		System.out.println("Qual seu nome? ");
		String nome = in.next();
		System.out.println("Qual seu email? ");
		String email = in.next();
		h[v] = new Quarto(nome, email);
		
		
	}
	          
	for (int v = 0; v < h.length; v++) {
		if (h[v] != null) {
			System.out.println("O senhor(a) está no quarto: ");
			
		}
	}
}
	} 
		
		
		