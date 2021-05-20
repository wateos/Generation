package lista3laços;

import java.util.Locale;
import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		int contImpar = 0;
		int contPar = 0;
		
		for(int i = 0;i < 10; i++) {
			System.out.printf("Digite o %d° numero: ",i+1);
			num = leia.nextInt();
			if(num%2==0)contPar++;
			else contImpar++;
		}
		
		System.out.printf("%d números são pares\n",contPar);
		System.out.printf("%d números são ímpares",contImpar);

	}

}
