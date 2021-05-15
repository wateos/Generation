package exerc�cios;

import  java.util.Locale ;
import  java.util.Scanner ;

public  class  CalculoIR {
	public  static  void  main ( String [] args ) {
		
		Locale . setDefault ( Locale . US );
		Scanner leiaD =  new  Scanner (System.in);
		Scanner leiaS =  new  Scanner (System.in);
		
		String nome;
		char genero;
		char emergencial;
		boolean auxilio;
		double salarioAnual;
		double salarioMes;
		double imposto = 0.0;
		
		System.out.printf ("Informe seu nome: " );
		nome = leiaS.nextLine();
		System.out.printf ("seu genero M , F , O: " );
		genero = leiaS.nextLine().toUpperCase().charAt(0);
		System.out.printf ("Infome se pegou auxilio S-sim ou N-n�o: " );
		emergencial = leiaS.nextLine().toUpperCase().charAt(0);
		auxilio = (emergencial == 'S' ) ?  true  :  false ;
		System.out.printf ("Sal�rio Mensal: ");
		salarioMes = leiaD.nextDouble ();
		
		salarioAnual = salarioMes *  12 ;
		
		if (salarioAnual >=  60000.0 ) {
			
			System.out.println ("\nVc deve pagar imposto! ");		
			if (salarioMes <=  6000.0 ) {
				
				imposto = salarioAnual *  0.15 ;
				
			} else  if (salarioMes <=  10000.0 ) {
				
				imposto = (salarioAnual *  0.17 );
				
			} else {
		
				imposto = (salarioAnual *  0.25 );
				
			}
			
			if (auxilio) {
				 System.out.println("Fraude! ");
				 imposto +=  3000.0 ;
			 }
			 System.out.printf ("Nome: %s\n" , nome);
			 System.out.printf ("Genero: %c\n" , genero);
			 System.out.printf ("Salario Anual: %.2f\n" , salarioAnual);
			 System.out.printf("Imposto: %.2f\n\n" , imposto);
			 
		} else {
			
			if (auxilio) {
				System.out.println ("\nVc n�o deve pagar IR" );
				System.out.printf ("Nome: %s\n " , nome);
				System.out.printf ("Tipo: %c\n " , genero);
				System.out.printf ("Salario Anual: %.2f\n" , salarioAnual);
				System.out.printf ("Imposto: %.2f\n" , imposto);
				System.out.println ("Tu est� isento\n" );
			}
			
			System.out.println ("\nN�o � preciso pagar IR");
			System.out.printf ("Nome: %s \n" , nome);
			System.out.printf ("Tipo: %c \n" , genero);
			System.out.printf ("Salario Anual: %.2f\n" , salarioAnual);
			System.out.printf ("Imposto: %.2f\n" , imposto);
			System.out.println ("Tu est� isento e pode retirar mais um auxilio emergencial!\n");
			}
		
		leiaS.close();
		leiaD.close();
	}
}
