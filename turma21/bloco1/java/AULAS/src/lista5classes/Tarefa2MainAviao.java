package lista5classes;

import java.util.Scanner;

public class Tarefa2MainAviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Tarefa2ClasseAviao aviao1 = new Tarefa2ClasseAviao();
		char decisao = ' ';
		
		System.out.println("Informe o modelo do avi�o:");
		aviao1.modelo = leia.nextLine();
		
		System.out.println("Decolar 'S' ou 'N':");
		decisao = leia.next().toUpperCase().charAt(0);
		
		if( decisao == 'S')
			aviao1.decolar();
		else if( decisao == 'N')
			aviao1.pousar();
		
		System.out.println("Altura ap�s o tempo informado ser� em Km:"+aviao1.altura());
		
		if(aviao1.ligado == true) {
			System.out.println("Pousar avi�o 'S' ou 'N':");
			decisao = leia.next().toUpperCase().charAt(0);
			if( decisao == 'S' && aviao1.ligado == true)
				aviao1.pousar();
			else 
				System.out.println("O avi�o continua voando!");
		}
	}

}
