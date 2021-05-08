package Lista4VetoresMatrizes;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		
		double matriz[][] = new double[ 3 ][ 3 ];
		int cont = 0;
		
		for( int i =0; i<3; i++) {
			for( int j =0; j<3; j++) {
				System.out.printf("%d° linha %d° coluna:",i+1,j+1);
				matriz[i][j] = leia.nextDouble();
				if( matriz[i][j]>10) cont++;
			}
		}
		System.out.printf("A matriz tem %d valores maiores que 10.", cont);
		
	}

}
