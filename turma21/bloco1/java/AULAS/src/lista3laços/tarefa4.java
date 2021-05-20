package lista3laços;

import java.util.Locale;
import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int sexo = 0;
		int cont = 0;
		int caract = 0;
		int mNervosas = 0;
		int hAgressivos = 0;
		int pCalmas = 0;
		int oCalmos = 0;
		int pNervosas40 = 0;
		int pCalmas18 = 0;
	
		while(cont < 5) {
			System.out.println("idade:");
			idade =leia.nextInt();
			System.out.println("Sexo(1-Feminino/2-Maculino/3-Outros):");
			sexo =leia.nextInt();
			
			if (sexo == 1) {
				
				System.out.println("Você é uma pessoa 1-Calma, 2-Nervosa ou 3-Agressiva?");
				caract = leia.nextInt();
				if( caract == 1)  {
					pCalmas++;
					if(idade < 18) pCalmas18++;
				}
				else if(caract == 2) {
					mNervosas++;
					if(idade > 40)pNervosas40++;
				}
				System.out.println();
			}
			
			else if(sexo == 2) {
				System.out.println("Você é uma pessoa 1-Calma, 2-Nervosa ou 3-Agressiva?");
				caract = leia.nextInt();
				if( caract == 1)  {
					pCalmas++;
					if(idade < 18) pCalmas18++;
				}
				else if(caract == 2) {
					if(idade > 40) pNervosas40++;
				}
				else if(caract == 3) hAgressivos++;
				System.out.println();
			}
			
			else if (sexo == 3) {
				System.out.println("Você é uma pessoa 1-Calma, 2-Nervosa ou 3-Agressiva?");
				caract = leia.nextInt();
				if( caract == 1)  {
					pCalmas++;
					oCalmos++;
					if(idade < 18) pCalmas18++;
				}
				else if(caract == 2) {
					if(idade > 40) pNervosas40++;
				}
				System.out.println();
			}
			
			cont++;
			
		}
		
		System.out.printf("\nO número de pessoas calmas é: %d",pCalmas);
		System.out.printf("\nO número de mulheres nervosas é: %d",mNervosas);
		System.out.printf("\nO número de homens agressivos é: %d",hAgressivos);
		System.out.printf("\nO número de outros calmos é: %d",oCalmos);
		System.out.printf("\nO número de pessoas nervosas com mais de 40 anos é: %d",pNervosas40);
		System.out.printf("\nO número de pessoas calmas com menos de 18 anos é: %d",pCalmas18);

	}

}
