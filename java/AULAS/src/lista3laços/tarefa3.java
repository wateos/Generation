package lista3laços;

import java.util.Locale;
import java.util.Scanner;

public class tarefa3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int cont21 = 0;
		int cont50 = 0;
	
		while(idade !=-99) {
			System.out.println("Informe uma idade e digite -99 para sair:");
			idade = leia.nextInt();
			if(idade<21 && idade > 0) cont21++;
			if(idade>50 && idade > 0) cont50++;
		}
		
		System.out.printf("%d é o total de idades informadas com menos de 21 anos\n",cont21);
		System.out.printf("%d é o total de idades informados com mais de 50 anos\n",cont50);

	}

}
