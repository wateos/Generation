package lista5classes;

public class Tarefa3ClasseEletronico {
	
	private String marca = "";
	private String modelo = "";
	private String tipo = "";
	private boolean fase = false;

	
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
		if(status == 'S' && fase == true) System.out.println("Desligando");
		else if (status == 'N' && fase == true) System.out.println("Permanecera ligado");
		else System.out.println("dispositivo já desligado");
	}
	
	public void usar(char status) {
		if(status == 'S' && fase == true) System.out.println("Usando");
		else if (fase == false)
			System.out.println("dispositivo desligado ligue para usar");
		else 
			System.out.println("dispositivo ligado sem uso");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void mostrarDados() {
		System.out.println("Modelo:"+getModelo());
		System.out.println("Marca:"+getMarca());
		System.out.println("Tipo:"+getTipo());
	}
	
}
