package aplicação;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
import entidades.funcionarios;


class FuncionariosPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List <funcionarios> funcionario = new ArrayList<>();
		
		System.out.println("Qual seu nome? ");
		String nome = in.next();
		System.out.println("Qual seu id? ");
		int id = in.nextInt();
		System.out.println("Qual seu salario? ");
		double salario = in.nextInt();
		
		
		funcionario.add(new funcionarios(id, nome, salario));
	}

}
