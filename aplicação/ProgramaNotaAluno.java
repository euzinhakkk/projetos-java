package aplicação;
import java.util.Scanner;

import entidades.NotaAluno;
public class ProgramaNotaAluno {

	

	public static void main(String[]args) {	
		
	
		//NotaAluno aluno = new NotaAluno();
		//aluno.setNome("carla ");
		//aluno.setMatricula(1020);
		//aluno.setN1(5);
		//aluno.setN2(7);
		//aluno.setN3(9);
		//aluno.setN4(8);
		
		//double m1 = aluno.calculoMedia();
		//System.out.println(m1);
		//System.out.println(aluno.calculoMedia());
		//System.out.println(aluno);
	
		
		
		/* Scanner in = new Scanner(System.in);
		
		NotaAluno aluno;
		aluno = new NotaAluno();
		
		System.out.println("Qual seu nome?");
		aluno.setNome(in.next());
		System.out.println("Qual sua matrícula? ");
		aluno.setMatricula(in.nextInt());
		System.out.println("Qual sua nota n1: ");
		aluno.setN1(in.nextDouble());
		System.out.println("Qual sua nota n2: ");
		aluno.setN2(in.nextDouble());
		System.out.println("Qual sua nota n3: ");
		aluno.setN3(in.nextDouble());
		System.out.println("Qual sua nota n4: ");
		aluno.setN4(in.nextDouble());
		
		System.out.println(aluno); */
		
		
		
		Scanner in = new Scanner(System.in);
		
		//NotaAluno []alunos = new NotaAluno[2];

		
		//alunos[0] = new NotaAluno();
		//alunos[0].setNome("carla");
		//alunos[0].setMatricula(1020);
		//alunos[0].setN1(8);
		//alunos[0].setN2(5);
		//alunos[0].setN3(9);
		//alunos[0].setN4(3);
		
		
		//alunos[1] = new NotaAluno("Carla", 1020,8,5,9,3);
		//System.out.println(alunos[0]);
		//System.out.println(alunos[1]);
		
		
		System.out.println("Quantos alunos serão cadastrados? ");
		int qtd = in.nextInt();
		
		NotaAluno []alunos = new NotaAluno[qtd];
		
		
		for(int i = 0; i < alunos.length; i++) {
		alunos[i] = new NotaAluno();
		
		System.out.println("Qual seu nome? ");
		alunos[i].setNome(in.next());
		System.out.println("Qual sua matrícula? ");
		alunos[i].setMatricula(in.nextInt());
		System.out.println("Qual sua n1? ?");
		alunos[i].setN1(in.nextDouble());
		System.out.println("Qual sua n2?");
		alunos[i].setN2(in.nextDouble());
		System.out.println("Qual sua n3? ");
		alunos[i].setN3(in.nextDouble());
		System.out.println("Qual sua n4?");
		alunos[i].setN4(in.nextDouble());
		
		}
		
		for(int i = 0; i < alunos.length; i++) {
			
			System.out.println("Qual seu nome: ");
			String nome = in.next();
			System.out.println("Qual sua matrícula:s ");
			int matrícula = in.nextInt();
			System.out.println("Qual sua n1: ?");
			double  n1 = in.nextDouble();
			System.out.println("Qual sua n2:");
			double  n2 = in.nextDouble();
			System.out.println("Qual sua n3: ");
			double  n3 = in.nextDouble();
			System.out.println("Qual sua n4:");
			double  n4 = in.nextDouble();
			alunos[i] = new NotaAluno(nome, matrícula, n1,n2,n3,n4);
		} 
		
		for(int i = 0; i < alunos.length; i++) {
			alunos[i] = new NotaAluno();
		}
	}
}

		






	