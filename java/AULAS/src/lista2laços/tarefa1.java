package lista2la�os;

import java.util.Locale;
import java.util.Scanner;

public class tarefa1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
			
		System.out.println("Informe o primeiro n�mero:");
		a = leia.nextInt();
		System.out.println("Informe o segundo n�mero:");
		b = leia.nextInt();
		System.out.println("Informe o terceiro n�mero:");
		c = leia.nextInt();
			
		if(a>=b && a>=c) 
			System.out.printf("O primeiro N� � o maior %d",a);	
		else if(b>=a && b>=c)
			System.out.printf("O segundo N� � o maior %d",b);
		else
			System.out.printf("O terceiro N� � o maior %d",b);
	
	}

}
