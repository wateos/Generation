package lista3laços;

import java.util.Locale;
import java.util.Scanner;

public class tarefa5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double num = 0;
		double soma = 0;
		
		do{
			System.out.println("Digite um número para o somatório ou zero para parar: ");
			num = leia.nextDouble();
			soma += num;
			
		}while(num !=0);
		
		System.out.printf("A soma total de todos os números informados é: %.1f",soma);
		
	}

}
