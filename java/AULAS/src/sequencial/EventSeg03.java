package sequencial;

import java.util.Scanner;

public class EventSeg03 {
public static void main(String[] args) {
		
		int seg, min, hor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o tempo de duraçado do evento em segundos:");
		seg = leia.nextInt();
		hor = seg/3600;
		min = (seg%3600)/60;
		seg = (seg%3600)%60;
		
		System.out.println("O tempo de duração do evento foi de "+hor+" hora(s) "+min+" minuto(s) e "+seg+" segundo(s).");
		
	}

}