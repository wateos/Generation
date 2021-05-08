package Lista4VetoresMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		Random random = new Random();
		
		double matriz1[][] = new double[ 2 ][ 2 ];
		double matriz2[][] = new double[ 2 ][ 2 ];
		double soma[][] = new double[2][2];
		double subt[][] = new double[2][2];
		char opcao = ' ';
		double constante = 0.0;
		
		
		for( int i =0; i<2; i++) {
			for( int j =0; j<2; j++) {
				//System.out.printf("M1 %d° linha %d° coluna:",i+1,j+1);
				//matriz1[i][j] = leia.nextDouble();
				matriz1[i][j] =  random.nextDouble()*5;
				//System.out.printf("M2 %d° linha %d° coluna:",i+1,j+1);
				//matriz2[i][j] = leia.nextDouble();
				matriz2[i][j] = random.nextDouble()*5;
			}
		}
		
		
		// mostrando as matrizes criadas:
		System.out.print("M1 = [");
	    for (int i =0; i<matriz1.length; i++) {
	    	System.out.print(" [");
	    	for( int j =0; j<2; j++) {
	    		System.out.printf("  %.1f",matriz1[i][j]);
	    	}
	    	System.out.print(" ]");
	    }
	    System.out.println(" ]");
	    
	    System.out.print("M2 = [");
	    for (int i =0; i<matriz1.length; i++) {
	    	System.out.print(" [");
	    	for( int j =0; j<2; j++) {
	    		System.out.printf("  %.1f",matriz2[i][j]);
	    	}
	    	System.out.print(" ]");
	    }
	    System.out.println(" ]");
	    do {
	    	System.out.println();
	    	System.out.println("(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes\n(5) Sair\n");
	    	System.out.printf("Digite o numero da opção desejada: ");
	    	opcao =leia.next().charAt(0);
	    	System.out.println();
	    	
	    	switch(opcao) {
    			case '1':
    			{
    				for( int i =0; i<2; i++) {
    					for( int j =0; j<2; j++) {
    						soma[i][j] = matriz2[i][j] + matriz1[i][j];
    					}
    				}
    			}
    			break;
    			case '2':
    			{
    				for( int i =0; i<2; i++) {
    					for( int j =0; j<2; j++) {
    						subt[i][j] = matriz2[i][j] - matriz1[i][j];
    					}
    				}
    			}
    			break;
    			case '3':
    			{	
    				System.out.printf("Informe o valor da constante: ");
    				constante = leia.nextDouble();
    				for( int i =0; i<2; i++) {
    					for( int j =0; j<2; j++) {
    						matriz2[i][j] = matriz2[i][j] + constante;
    						matriz1[i][j] = matriz1[i][j] + constante;
    					}
    				}
    			}
    			break;
    			case '4':
    			{
    				System.out.print("M1 = [");
    				for (int i =0; i<2; i++) {
    					System.out.print(" [");
    					for( int j =0; j<2; j++) {
    						System.out.printf("  %.1f",matriz1[i][j]);
    					}
    					System.out.print(" ]");
    				}
    				System.out.println(" ]");
    		       
    				System.out.print("M2 = [");
    				for (int i =0; i<2; i++) {
    					System.out.print(" [");
    					for( int j =0; j<2; j++) {
    						System.out.printf("  %.1f",matriz2[i][j]);
    					}
    					System.out.print(" ]");
    				}
    				System.out.println(" ]");
    		    
    				System.out.print("MSoma = [");
    				for (int i =0; i<2; i++) {
    					System.out.print(" [");
    					for( int j =0; j<2; j++) {
    						System.out.printf("  %.1f",soma[i][j]);
    					}
    					System.out.print(" ]");
    				}
    				System.out.println(" ]");
    		    
    				System.out.print("MSubt = [");
    				for (int i =0; i<2; i++) {
    					System.out.print(" [");
    					for( int j =0; j<2; j++) {
    						System.out.printf("  %.1f",subt[i][j]);
    					}
    					System.out.print(" ]");
    				}
    				System.out.println(" ]");
    			}
    			break;
    			default :
    			break;
    			
	    	}
	    	
	    }while(opcao != '5');
	    
	    System.out.println("FIM DO PROGRAMA!");	
	}

}
