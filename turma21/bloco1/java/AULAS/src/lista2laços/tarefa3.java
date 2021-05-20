package lista2laços;

import java.util.Locale;
import java.util.Scanner;

public class tarefa3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.println("Informe sua idade:");
		idade = leia.nextInt();
			
		if(idade>=10 && idade<=14)
			System.out.printf("Idade entre 10-14 -Infantil: %d",idade);	
		else if(idade>14 && idade<=17)
			System.out.printf("Idade entre 15-17 -Juvenil: %d",idade);	
		else if(idade>17 && idade<=25)
			System.out.printf("Idade entre 18-25 -Adulto: %d",idade);
		else
			System.out.printf("Idade fora de categoria.");
	}
}
