package programas;

import java.util.Scanner;
import classes.Graduacao;

public class ProjetoEscola {

	public static void main(String[] args) {
			
			Scanner leia = new Scanner (System.in);
			Graduacao aluno1 = new Graduacao(20,"cpf");

			final String nomeEscola = "Generation";
			final String sloganEscola = "Formando sonhadores para n�o deixarem de sonhar";
			String tipoEnsino[] = {"BASICO","MEDIO","GRADUA��O","P�S","MESTRADO"};
			int opcaoDesejada;
			System.out.printf("Escola: %s\nSlogan: %s\n",nomeEscola,sloganEscola);
			System.out.print("\n1 - BASICO\n2 - M�DIO\n3 - GRADUA��O\n4 - P�S\n5 - MESTRADO\n\nDIGITE O NUMERO DO ENSINO QUE VOC� DESEJA: ");
			opcaoDesejada = leia.nextInt();
			opcaoDesejada -= 1;
			if(opcaoDesejada == 0 ) //ENSINO BASICO!!!
			{
				
			System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
				
			}
			
			else if(opcaoDesejada == 1 ) //ENSINO MEDIO!!!
			{
				
			System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
			
			
			}
			
			else if(opcaoDesejada == 2 ) //ENSINO GRADUA��O!!!
			{
				
			System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
			
			System.out.printf("\nbonus: "+aluno1.getBonus());
			aluno1.adicionarNota(10.0);
			System.out.printf("\npontos: "+aluno1.getPontos());
			aluno1.tirarNota(13.0);
			System.out.printf("\npontos: "+aluno1.getPontos());
			System.out.printf("\nbonus: "+aluno1.getBonus());
			aluno1.tirarNota(13);
			System.out.printf("\npontos: "+aluno1.getPontos());
			System.out.printf("\nbonus: "+aluno1.getBonus());
			
			}
			
			else if(opcaoDesejada == 3 ) //ENSINO P�S!!!
			{
				
			System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);	
			
			}
			
			else if(opcaoDesejada == 4 ) //ENSINO MESTRADO!!!
			{
				
			System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
				
			}
			
	}

}
