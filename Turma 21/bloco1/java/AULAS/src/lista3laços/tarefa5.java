package lista3la�os;

import java.util.Locale;
import java.util.Scanner;

public class tarefa5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double num = 0;
		double soma = 0;
		
		do{
			System.out.println("Digite um n�mero para o somat�rio ou zero para parar: ");
			num = leia.nextDouble();
			soma += num;
			
		}while(num !=0);
		
		System.out.printf("A soma total de todos os n�meros informados �: %.1f",soma);
		
	}

}
