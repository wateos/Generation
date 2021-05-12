package classes;

import java.util.Scanner;

public class Graduacao extends Estudante{

		private double bonus;
		
		public Graduacao(int matricula, String cpf) {
			
			super(matricula, cpf);
			bonus = 2.0;
		}

		public double getBonus() {
			return bonus;
		}

		public void usarBonus(double nota) {
			
			if ((super.getPontos() - nota) == -1 && (bonus >= 1.0 && bonus > 0)) {
				nota = nota - 1;
				super.tirarNota(nota);
				bonus = bonus - 1;
			} 
			else if((super.getPontos() - nota) == -2 && bonus == 2.0) {
				nota = nota - 2;
				super.tirarNota(nota);
				bonus = bonus -2;
			}
			
		}
			
		public void tirarNota(double pontos) {
			
				Scanner leia = new Scanner(System.in);
				double nota =  pontos;
				
				while (nota > (super.getPontos()+bonus)) {
					System.out.println("\nInforme uma nota válida: ");
					nota = leia.nextDouble();
				}
				
				if (super.getPontos() - nota < 0.0) usarBonus(nota);
				else super.tirarNota(nota);
				
				//leia.close();
			
		}
				
}


