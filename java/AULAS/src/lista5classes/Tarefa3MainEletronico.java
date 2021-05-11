package lista5classes;

import java.util.Scanner;

public class Tarefa3MainEletronico {

	public static void main(String[] args) {
		
		Tarefa3ClasseEletronico eletronico1 = new Tarefa3ClasseEletronico();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o modelo:");
		eletronico1.setModelo(leia.nextLine());
		System.out.println("Informe a marca:");
		eletronico1.setMarca(leia.nextLine());
		System.out.println("Informe o tipo de dispositivo:");
		eletronico1.setTipo(leia.nextLine());
		
		char decisao = ' ';
		
		System.out.println("Ligar S-sim ou N-não:");
		decisao = leia.next().toUpperCase().charAt(0);
		eletronico1.ligar(decisao);
		
		System.out.println("Usar S-sim ou N-não:");
		decisao = leia.next().toUpperCase().charAt(0);
		eletronico1.usar(decisao);
		
		System.out.println("Desligar S-sim ou N-não:");
		decisao = leia.next().toUpperCase().charAt(0);
		eletronico1.delisgar(decisao);
		
		eletronico1.mostrarDados();
				
	}

}
