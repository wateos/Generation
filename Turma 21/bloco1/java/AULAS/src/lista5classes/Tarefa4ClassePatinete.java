package lista5classes;

public class Tarefa4ClassePatinete {
        
		private String cor = "";
		private String modelo = "";
		private int velocidade = 0;
		
		public void andar(int vel) {
			velocidade += vel;
			if(velocidade == 0) System.out.println("aceleração nula portanto parado");
		}
		
		public void velocidade() {
			if(velocidade == 0) System.out.println("aceleração nula portanto parado");
			else System.out.println("velocidade: "+velocidade);
		}
		
		public void parar() {
			velocidade = 0;
			System.out.println("Parado, velocidade: "+velocidade);
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}
		
		
		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public void mostrarAtributos() {
	
			System.out.println("Cor: "+getCor());
			System.out.println("Modelo: s"+getModelo());
	
		}
		
}
