package lista5classes;

public class Tarefa3Eletronico {
	
	public String marca = "";
	public String modelo = "";
	public String tipo = "";
	public boolean fase = false;

	
	public void ligar(char status) {
		if(status == 'S') {
			System.out.println("Ligado");
			fase = true;
		}
		else { 
			System.out.println("Permanecera desligado");
			fase = false;
		}
	}
	
	public void delisgar(char status) {
		if(status == 'S') System.out.println("Desligado");
		else System.out.println("Permanecera desligado");
	}
	public void usar(char status) {
		if(status == 'S' && fase == true) System.out.println("Usando");
		}
	
	
}
