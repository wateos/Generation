package lista3laços;

import java.util.Locale;

public class tarefa1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		for(int i = 1000;i < 1999; i++)	
			if(i%11==5) System.out.println(i);	
	}

}
