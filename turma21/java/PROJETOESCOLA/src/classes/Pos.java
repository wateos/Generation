package classes;

import java.util.Scanner;

public class Pos extends Estudante{

	private double credito;
	
	public Pos(int matricula, String cpf) {
		
		super(matricula, cpf);
		credito = 5.0;
	}

	public double getCredito() {
		return credito;
	}

	public void usarCredito(double nota) {
		double aux=0.00;
	    if ((super.getPontos()+credito) >= nota) {
			aux = nota - super.getPontos();
			credito=credito-aux;
			super.adicionarNota(aux);
			super.tirarNota(nota);
		} 
	}
	
	@Override
	public void tirarNota(double pontos) {
		
			Scanner leia = new Scanner(System.in);
			double nota =  pontos;
			
			while (nota > (super.getPontos()+credito)) {
				System.out.printf("\nImpossível retirar valor %.1f. Pois o toral pontos (%.1f) + bonus (%.1f) é menor que a nota de retirada. Informe um valor de retirada valido: ", nota, super.getPontos(), credito);
				nota = leia.nextDouble();
			}
			
			if (nota <= super.getPontos()) {
				super.tirarNota(nota);
			}
			else if (nota <= super.getPontos()+credito) usarCredito(nota);
			
			//leia.close();
		
	}
			
}
