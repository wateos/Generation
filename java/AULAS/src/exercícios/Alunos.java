package exercícios;

import java.util.Scanner;

public class Alunos {

	public static void main(String[] args) {
		
		//Exercício de comparação de Strings por método da classe.
		
		Scanner leia = new Scanner(System.in);

		String matricula[] = new String[35];
		String alunos[] = { "Alexandre Salerno", "Alexsander da Silva Sousa", "Aline Moreira Brilhante",
				"Ana Flávia Porto Silva Neves", "Andára Finot da Silva", "arthur reis allen", "Barbara dos Santos",
				"Bruno Wesley Callachi Rocha", "Dafhne Noemi da Silva Novais", "David da Costa Mariano",
				"Elielthon Soares de Souza", "Erika Rosany de Almeida Lima", "Fabricio Siqueira Macedo",
				"Fernando Salomão Constancio", "Giovanna Cirillo Torres", "Guilherme Mendes Carvalho",
				"Guilherme Monteiro Lopes", "Isabelli Santos Silva", "Israel Dantas da Silva", "Jessica Yuki Toyota",
				"Jonatas Michel de Cardoso Vieira", "José Luis Correia dos Santos", "Juliana Brito Favero Ribeiro",
				"Lorrans Matildes Facca", "Lucas Teodoro de Sousa", "Maria Luísa Maricato",
				"Mateus Rosendo Firmino de Oliveira", "Matheus de Souza Barbosa", "Nathalia Beatriz Silva Pereira",
				"Pedro Henrique de Azevedo Magalhães", "Renato Novais da Silva", "Renato Yukio Ossiama Nakamura",
				"Robson de Jesus Vasconcelos", "Tainah Vinha", "Vinicius Martins Santos" };
		String mat;
		int notas[] = new int[35];
		char resposta;
		boolean continua = true;

		System.out.printf("GRUPO G8");
		System.out.printf("\nPARTICIPANTES: Mateus, Fernando, Malu, Nathalia, Barbara");
		System.out.println();

		// MATRICULAS
		for (int i = 0; i < matricula.length; i++) {
			matricula[i] = "G8-" + (i + 1);
		}

		System.out.println("\nMAT \t NOME");
		for (int i = 0; i < matricula.length; i++) {
			System.out.printf("%s \t %s\n", matricula[i], alunos[i]);
		}
		System.out.println();

		do{
			System.out.print("\nDigite a matricula do aluno: ");
			mat = leia.nextLine().toUpperCase();
			
			for (int i = 0; i < matricula.length; i++) {
				if (mat.equals(matricula[i])) {
					System.out.printf("%s - %s", matricula[i], alunos[i]);
					System.out.printf("\nDigite a nota do aluno: ");
					notas[i] = leia.nextInt();

					System.out.printf("Quer continuar S/N: ");
					resposta = leia.next().toUpperCase().charAt(0);
					if (resposta == 'S') {
						continua = true;
					} else {
						continua = false;
					}
					System.out.printf("=================================");
					break;
				}
			}
			
		}while(continua);

		System.out.printf("\nLISTA DE ALUNOS QUE POSSUEM NOTA:");
		System.out.printf("\nMAT\tNOME\t\t\t\t\tNOTA");
		for (int i = 0; i < matricula.length; i++) {
			if (notas[i] != 0) {
				System.out.printf("\n%s\t%s\t%d", matricula[i], alunos[i], notas[i]);
			}

		}
		leia.close();
	}
}

