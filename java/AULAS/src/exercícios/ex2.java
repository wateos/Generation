package exerc�cios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valor = 1.0;
		double somatorio = 0.0;
		int cont = 1;
		
		while(valor>0){
			System.out.println("informe o "+cont+"o valor:");
			valor = leia.nextDouble();
			if(valor>0){
				somatorio += valor;
				cont++;
		    }else
				System.out.println(cont+"� 1N�mero neutro, programado para finalizar e o valor n�o ser� computado.");
		}
		
		System.out.printf("\nTotal do somat�rio: %.2f ", somatorio);
		System.out.printf("\nTotal de valores lidos: %d ", cont-1);	
		System.out.printf("\nA m�dia dos valores lidos: %.2f ", somatorio/(cont-1));

	}

}
