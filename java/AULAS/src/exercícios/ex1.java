package exercícios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int cont = 233;
		
		do{
			System.out.printf("\n %d",cont);
			cont+=5;
		}while(cont<=300);
		do{
			System.out.printf("\n %d",cont);
			cont+=3;
		}while(cont<=400);
		do{
			System.out.printf("\n %d",cont);
			cont+=5;
		}while(cont<=456);
	}

}
