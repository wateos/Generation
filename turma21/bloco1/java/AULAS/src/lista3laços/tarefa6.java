package lista3la�os;

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
			System.out.println("Digite um n�mero para o somat�rio ou zero para sair: ");
			num = leia.nextInt();
			if(num%3==0) {
				soma += num;
				cont++;
			}
			
		}while(num !=0);
		
		System.out.printf("A m�dia dos n�meros m�ltiplos de 3 �: %.2f",soma/cont);
		
	}

}
