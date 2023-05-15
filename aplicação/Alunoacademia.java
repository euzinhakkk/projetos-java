package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.funcionarios;

public class Alunoacademia {

	public static void main(String[] args) {
		List <Integer> lista = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
		List <Alunoacademia> AlunoAcademia = new ArrayList<>();
		
		int opc = 0;
		do {
			
			System.out.println("Bem-Vindo a academia!");
			System.out.println("1 - cadastrar aluno" + "\n2 - nome do aluno" + "\n3 - relatorio geral" + "\n9 - sair");
			opc = in.nextInt();
			
			
			switch (opc) {
			case 1:
				
				System.out.println("Qual seu nome: ");
				String nome = in.next();
				System.out.println("Qual sua idade:");
				int idade = in.nextInt();
				System.out.println("Qual seu peso: ");
				double peso =in.nextDouble();
				System.out.println("Qual sua altura: ");
				double altura = in.nextDouble();
				System.out.println("Qual seu ID: ");
				int id = in.nextInt();
				aluno.add(new AlunoAcademia(idade, id, peso, altura, nome));
				continue;
				
			case 2:
				for(int i = 0; i < aluno.size(); i++) {
					System.out.println(aluno.get(i).getNome());
				}
			}
			
			
		}while(opc !=9);
	}
}
