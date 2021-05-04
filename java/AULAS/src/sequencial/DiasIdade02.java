package sequencial;

import java.util.Scanner;

public class DiasIdade02 {
	public static void main(String[] args) {
		
		int dia;
		int mes;
		int ano;
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual sua idade em dias?");
		idade = leia.nextInt();
		
		ano = 2021-(idade/365)-1;
		mes = (idade%365)/30;
		dia = ((idade%365)-2)%30-3;
				
		System.out.println("Data de nascimento: "+dia+"/"+mes+"/"+ano);

	}
}
