package lista5classes;

import java.util.Scanner;

public class Tarefa4MainPatinete {

	public static void main(String[] args) {
		
		Scanner leiaS = new Scanner(System.in);
		Scanner leiaI = new Scanner(System.in);
		Tarefa4ClassePatinete  patinete1 = new Tarefa4ClassePatinete();
		
		char status = ' ';
		
		
		System.out.println("informe o modelo:");
		patinete1.setModelo(leiaS.nextLine());
		System.out.println("informe a cor:");
		patinete1.setCor(leiaS.nextLine());
		
		patinete1.parar();
		
		System.out.println("Andar S-sim ou N-não:");
		status = leiaS.next().toUpperCase().charAt(0);
		if(status == 'S') {
			System.out.println("Informe a velocidade:");
			patinete1.andar(leiaI.nextInt());
		}else System.out.println("parado");
		
		patinete1.velocidade();
		
		patinete1.parar();
		
		patinete1.mostrarAtributos();
		
	}

}
