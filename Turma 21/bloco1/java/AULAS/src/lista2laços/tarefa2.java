package lista2laços;

import java.util.Locale;
import java.util.Scanner;

public class tarefa2 {

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
			
		if(a>=b && a>=c) {
				if(b>=c)
					System.out.printf(" ordem crescente: 1°-%d 2°-%d 3°-%d ", c, b, a);
				else
					System.out.printf(" ordem crescente: 1°-%d 2°-%d 3°-%d ", b, c, a);
		}
		else if(b>=a && b>=c) {
				if(a>=c)
					System.out.printf(" ordem crescente: 1°-%d 2°-%d 3°-%d ", c, a, b);
				else
					System.out.printf(" ordem crescente: 1°-%d 2°-%d 3°-%d ", a, c, b);
		}
		else if(c>=a && c>=b) {
				if(a>=b)
					System.out.printf(" ordem crescente: 1°-%d 2°-%d 3°-%d ", b, a, c);
				else
					System.out.printf(" ordem crescente: 1°-%d 2°-%d 3°-%d ", a, b, c);
		}
	}

}
