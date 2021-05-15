package classes;

import java.util.Scanner;

public class Mestrado extends Estudante{

		private double creditoMestrado;
		
		public Mestrado(int matricula, String cpf) {
			
			super(matricula, cpf);
			creditoMestrado = 10.0;
		}

		public double getCreditoMestrado() {
			return creditoMestrado;
		}

		public void usarCreditoMestrado(double nota) {
			double aux=0.00;
		    if ((super.getPontos()+creditoMestrado) >= nota) {
				aux = nota - super.getPontos();
				creditoMestrado=creditoMestrado-aux;
				super.adicionarNota(aux);
				super.tirarNota(nota);
			} 
		}
		
		@Override
		public void tirarNota(double pontos) {
			
				Scanner leia = new Scanner(System.in);
				double nota =  pontos;
				
				while (nota > (super.getPontos()+creditoMestrado)) {
					System.out.printf("\nImpossível retirar valor %.1f. Pois o toral pontos (%.1f) + bonus (%.1f) é menor que a nota de retirada. Informe um valor de retirada valido: ", nota, super.getPontos(), creditoMestrado);
					nota = leia.nextDouble();
				}
				
				if (nota <= super.getPontos()) {
					super.tirarNota(nota);
				}
				else if (nota <= super.getPontos()+creditoMestrado) usarCreditoMestrado(nota);
				
				//leia.close();
			
		}
				
}

