package lista5classes;

import java.util.Scanner;

public class Tarefa2ClasseAviao {
	
	Scanner leia = new Scanner(System.in);
	
	public String modelo;
	private double velKmH = 0;
	private double minutos = 0;
	private double alturaMetros = 0;
	public boolean ligado = false;
	private boolean subindo = false;
	
	public void decolar() {
		
		ligado = true;
		subindo = true;
		System.out.println("Voo iniciado!Informe a velocidade em km/h da viagem:");
		velKmH = leia.nextDouble();
		System.out.println("Subir por quantos minutos?");
		minutos = leia.nextDouble();
	}
	
	public double altura() {
		if(ligado == true && subindo == true && velKmH != 0) {
			
			alturaMetros = velKmH*(minutos/60);
			return alturaMetros;
		}
		return 0.0;
	}
	
	public void pousar() {
		ligado = false;
		subindo = false;
		alturaMetros = 0;
		velKmH = 0;
		System.out.println("pousando e desligando!");	
	}
		
}
