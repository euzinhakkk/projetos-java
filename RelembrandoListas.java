package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RelembrandoListas {

	public static void main(String[] args) {
		List <Integer> lista = new ArrayList<>(); //declara uma lista do tipo array list
		
		//lista.add(10); //adiciona itens a lista
		//System.out.println(lista.indexOf(10));
		//lista.indexOf(10); //mostra a posição do item na lista
		
		//lista.remove(0); // remove item da lista
		//lista.remove(lista.indexOf(10)); //aqui eu uso o valor 
		//System.out.println(lista.get(0)); //pega o item na posição desejada
	
		//for(int i = 0; i < 100; i++) {
			
			//lista.add(i);
			//System.out.println(lista.get(i));
		//}
		
		//System.out.println("Os pares são: ");
		//for(int i = 0; i < lista.size(); i++) {
			//if(i % 2 == 1) {
				
				//System.out.println(i);
		//	}
		// }
		Scanner in = new Scanner(System.in);
		String  opcao = "sim";
		//System.out.println("Gostaria de" + " responder uma pergunta? ");
		//opcao = in.next();
		
		int opc = 0;
		do {
			
			System.out.println("bem vindo a nossa academia: " );
			System.out.println("1 - cadastrar aluno" + "\n2 - relatorio" + "\n3 - relatorio geral" + "\n9 - sair");
			opcao = in.next();
			
			switch(opc) {
			case 1:
				System.out.println("Você vai cadastrar o aluno aqui: ");
				continue;
			case 2: 
				System.out.println("Você vai ter um relatorio de nomes: ");
				continue;
			case 3:
				System.out.println("Você vai ter um relatorio geral: ");
				continue;
			case 9: 
				System.out.println("hasta la vista! ");
				continue;
				default:
					System.out.println("opcao invalida");
					continue;
			}
					
		}while(opc != 9);
		
	}
}
		//while(!opcao.equalsIgnoreCase("sim")) { 
			
			//System.out.println("Você deseja continuar: ");
			//opcao = in.next();
		//}
//}
//}