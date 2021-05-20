package lista3laços;

import java.util.Locale;
import java.util.Scanner;

public class tarefa6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		double soma = 0;
		int cont = -1;
		
		do{
			System.out.println("Digite um número para o somatório ou zero para sair: ");
			num = leia.nextInt();
			if(num%3==0) {
				soma += num;
				cont++;
			}
			
		}while(num !=0);
		
		System.out.printf("A média dos números múltiplos de 3 é: %.2f",soma/cont);
		
	}

}
