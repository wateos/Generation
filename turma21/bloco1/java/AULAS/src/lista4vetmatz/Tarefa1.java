package lista4vetmatz;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		  Scanner entrada = new Scanner(System.in);
	     
	      int a[]= { 1, 0, 5, -2, -5, 7};
	      int soma = 0;
	      
	      soma = a[0]+a[1]+a[5];
	      System.out.println("soma: "+soma);
	      
	      a[4] = 100;
	      
	      System.out.print("A = [");
	      for (int i =0; i<a.length; i++) {
	    	  System.out.printf(" %d,",a[i]);
	      }
	      System.out.println(" ]");
	}

}
