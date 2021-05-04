package sequencial;

import java.util.Scanner;

public class IdadeDias01 {
	public static void main(String[] args) {
		
		int dia;
		int mes;
		int ano;
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o dia em q nasceu?");
		dia = leia.nextInt();
		
		System.out.println("Qual o mes em q nasceu?");
		mes = leia.nextInt();
		
		System.out.println("Qual o ano em q nasceu?");
		ano = leia.nextInt();
		
		idade = (2021-ano)*365-((12-mes)*30)+dia;
		
		System.out.println("Sua idade em dias é de aproximadamente: "+idade);
		
	}

}
