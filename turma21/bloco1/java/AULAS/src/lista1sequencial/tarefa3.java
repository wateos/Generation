package lista1sequencial;

import java.util.Locale;
import java.util.Scanner;

public class tarefa3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int seg, min, hor;
		
		System.out.println("Informe o tempo de duraçado do evento em segundos:");
		seg = leia.nextInt();
		hor = seg/3600;
		min = (seg%3600)/60;
		seg = (seg%3600)%60;
		
		System.out.println("O tempo de duração do evento foi de "+hor+" hora(s) "+min+" minuto(s) e "+seg+" segundo(s).");
		
	}
}
