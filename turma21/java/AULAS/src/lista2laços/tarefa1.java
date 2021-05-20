package lista2laços;

import java.util.Locale;
import java.util.Scanner;

public class tarefa1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
			
		System.out.println("Informe o primeiro número:");
		a = leia.nextInt();
		System.out.println("Informe o segundo número:");
		b = leia.nextInt();
		System.out.println("Informe o terceiro número:");
		c = leia.nextInt();
			
		if(a>=b && a>=c) 
			System.out.printf("O primeiro N° é o maior %d",a);	
		else if(b>=a && b>=c)
			System.out.printf("O segundo N° é o maior %d",b);
		else
			System.out.printf("O terceiro N° é o maior %d",b);
	
	}

}
