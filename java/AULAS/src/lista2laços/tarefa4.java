package lista2laços;

import java.util.Locale;
import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		int raiz = 0;
		
		System.out.println("Informe um número:");
		numero = leia.nextInt();
		
		if(numero%2==0)
			System.out.printf("O numero %d é par e sua raiz quadrada é: %.2f", numero, Math.sqrt(numero));
		else
			System.out.printf("O numero %d é impar e elevado ao quadrado é: %.2f", numero, Math.pow(numero,2));
	}

}
