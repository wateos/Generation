package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Graduacao;
import classes.Mestrado;
import classes.Pos;

public class ProjetoEscola {
	
	public static void main(String[] args) {
		
		Scanner leiaS = new Scanner (System.in);
		Scanner leiaI = new Scanner (System.in);
		Graduacao graduando1 = new Graduacao(0,"");
		Pos pos1 = new Pos(0,"");
		Mestrado mestrando1 = new Mestrado(0,"");

		final String nomeEscola = "Generation";
		final String sloganEscola = "Formando sonhadores para não deixarem de sonhar";
		String tipoEnsino[] = {"BASICO","MEDIO","GRADUAÇÃO","PÓS","MESTRADO"};
		int opcaoDesejada;
		
		do {
			System.out.printf("Escola: %s\nSlogan: %s\n",nomeEscola,sloganEscola);
			System.out.print("\n1 - BASICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR\n\nDIGITE O NUMERO DO ENSINO QUE VOCÊ DESEJA: ");
			opcaoDesejada = leiaI.nextInt();
			opcaoDesejada -= 1;
			if(opcaoDesejada == 0 ) //ENSINO BASICO!!!
			{
				
			
			}
		
			else if(opcaoDesejada == 1 ) //ENSINO MEDIO!!!
			{
			
				System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
		
		
			}
		
			else if(opcaoDesejada == 2 ) //ENSINO GRADUAÇÃO!!!
			{	
				char opc =' ';
				double valor = 0.0;
				
				System.out.printf("\nEscola: %s\nSlogan: %s\n\nEnsino %s\n\n",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
				System.out.print("Matricula: ");
				graduando1.setMatricula(leiaI.nextInt());
				System.out.print("CPF: ");
				graduando1.setCpf(leiaS.nextLine());
				
				for(int i =0; i<10; i++) {
					
					System.out.printf("\nBonus atual: %.1f",graduando1.getBonus());
					System.out.printf("\nTotal atual: %.1f ",graduando1.getPontos());
					System.out.printf("\nMOVIMENTO %d - I-inclusão de nota ou R-retirada de nota:",i+1);
					opc = leiaS.next().toUpperCase().charAt(0);
					System.out.printf("Valor movimento: ");
					valor = leiaI.nextDouble();
					if(opc == 'I') graduando1.adicionarNota(valor);
				    else if (opc == 'R') graduando1.tirarNota(valor);
					System.out.printf("Continuar 'S'/'N':\n");
					opc = leiaS.next().toUpperCase().charAt(0);
					if(opc == 'N') break;
					
				}
				
			}
		
			else if(opcaoDesejada == 3 ) //ENSINO PÓS!!!
			{
		
				char opc =' ';
				double valor = 0.0;
				
				System.out.printf("\nEscola: %s\nSlogan: %s\n\nEnsino %s\n\n",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
				System.out.print("Matricula: ");
				graduando1.setMatricula(leiaI.nextInt());
				System.out.print("CPF: ");
				graduando1.setCpf(leiaS.nextLine());
				
				for(int i =0; i<10; i++) {
					
					System.out.printf("\nCredito atual: %.1f",pos1.getCredito());
					System.out.printf("\nTotal atual: %.1f ",pos1.getPontos());
					System.out.printf("\nMOVIMENTO %d - I-inclusão de nota ou R-retirada de nota:",i+1);
					opc = leiaS.next().toUpperCase().charAt(0);
					System.out.printf("Valor movimento: ");
					valor = leiaI.nextDouble();
					if(opc == 'I') pos1.adicionarNota(valor);
				    else if (opc == 'R') pos1.tirarNota(valor);
					System.out.printf("Continuar 'S'/'N':\n");
					opc = leiaS.next().toUpperCase().charAt(0);
					if(opc == 'N') break;
					
				}
			}
		
			else if(opcaoDesejada == 4 ) //ENSINO MESTRADO!!!
			{
				
				char opc =' ';
				double valor = 0.0;
				
				System.out.printf("\nEscola: %s\nSlogan: %s\n\nEnsino %s\n\n",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
				System.out.print("Matricula: ");
				graduando1.setMatricula(leiaI.nextInt());
				System.out.print("CPF: ");
				graduando1.setCpf(leiaS.nextLine());
				
				for(int i =0; i<10; i++) {
					
					System.out.printf("\nCredito Mestrado atual: %.1f",mestrando1.getCreditoMestrado());
					System.out.printf("\nTotal atual: %.1f ",mestrando1.getPontos());
					System.out.printf("\nMOVIMENTO %d - I-inclusão de nota ou R-retirada de nota:",i+1);
					opc = leiaS.next().toUpperCase().charAt(0);
					System.out.printf("Valor movimento: ");
					valor = leiaI.nextDouble();
					if(opc == 'I') mestrando1.adicionarNota(valor);
				    else if (opc == 'R') mestrando1.tirarNota(valor);
					System.out.printf("Continuar 'S'/'N':\n");
					opc = leiaS.next().toUpperCase().charAt(0);
					if(opc == 'N') break;
					
				}
				
			}
			
			else if(opcaoDesejada == 5 ) //ENSINO MESTRADO!!!
			{
			
				System.out.println("Você saiu...");
			
			}
			
		}while(opcaoDesejada !=5);
	}
	
}

