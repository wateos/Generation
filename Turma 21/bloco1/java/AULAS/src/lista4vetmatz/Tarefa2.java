package lista4vetmatz;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		  
		Scanner entrada = new Scanner(System.in);
	    
	      int num[] = new int[ 6 ];
	      int somaPar = 0;
	      int contImpar =0;
	      
	      for (int i =0; i<num.length; i++) {
	    	  System.out.printf("Informe o %d° número: ",i+1);
	    	  num[i] = entrada.nextInt();
	      }
	     
	      System.out.print("Impares = [");
	      for (int i =0; i<num.length; i++) {
	    	  if(num[i]%2==1) {
	    		  System.out.printf(" %d",num[i]);
	    		  contImpar++;
	    	  }
	      }
	      System.out.println(" ]");
	      
	      System.out.print("Pares = [");
	      for (int i =0; i<num.length; i++) {
	    	  if(num[i]%2==0) {
	    		  System.out.printf(" %d",num[i]);
	    		  somaPar += num[i];
	    	  }
	      }
	      System.out.println(" ]");
	      System.out.println("A soma dos pares é: "+somaPar);
	      System.out.println("A a quantidade de impares é: "+contImpar);
	}
	
}
