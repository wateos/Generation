package lista6programas;

import lista6classes.Animal1;
import lista6classes.Cachorro1;
import lista6classes.Cavalo1;
import lista6classes.Preguica1;

public class Tarefa2MainAnimais {
	
	public static void main(String[] args) {
		
		Cachorro1 Cao = new Cachorro1();
		Cavalo1 Potro = new Cavalo1();
		Preguica1 bixoPreguica = new Preguica1();

		Potro.som();
		Potro.correr();
		Cao.som();
		Cao.correr();
		bixoPreguica.subir();
		bixoPreguica.som();
		
	}

}
