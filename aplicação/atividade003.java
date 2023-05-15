package aplicação;

import java.util.Scanner;

import entidades.Pessoa;

public class atividade003 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantas pessoas serão: ");
		int qtd = in.nextInt();
		
		Pessoa[]p1 = new Pessoa[qtd];
		for(int i = 0; i < p1.length; i++) {
			System.out.println("Qual o nome da pessoa? ");
			String nome = in.next();
			System.out.println("Qual a idade? ");
			int idade = in.nextInt();
			p1[i] = new Pessoa (nome, idade);
			
		}
		for(int i = 0; i < p1.length; i++) {
			if(p1[i].getIdade()<18) {
				System.out.println("O(a) " + p1[i].getNome() + " não pode beber, pois tem: " + p1[i].getIdade() + "anos");
				
			}
		}
	}
}
