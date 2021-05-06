package lista1sequencial;

import java.util.Locale;
import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int dia;
		int mes;
		int ano;
		int idade;
			
		System.out.println("Qual sua idade em dias?");
		idade = leia.nextInt();
			
		ano = 2021-(idade/365)-1;
		mes = (idade%365)/30;
		dia = ((idade%365)-2)%30-3;
					
		System.out.println("Data de nascimento: "+dia+"/"+mes+"/"+ano);

		
	}

}
