package exemplos;

public class ClassePessoa {
	public String nome;
	public int anoNascimento;
	public char genero;
	public boolean vivo;
	
	public void idadeAproximada() {
		System.out.println("A idade aproximada � " + (2021 - anoNascimento));
	}
	
}
