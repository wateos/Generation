package sequencial;

import java.util.Scanner;

public class Calc04 {
	public static void main(String[] args) {
		
		double a, b, c, r, s, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe 3 numeros positivos a, b e c respectivamente:");
		a = leia.nextDouble();
		b = leia.nextDouble();
		c = leia.nextDouble();
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r+s)/2;
		
		System.out.println("O valor da expressão D: d = "+d);
		
	}

}
