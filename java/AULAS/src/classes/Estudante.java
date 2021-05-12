package classes;

public class Estudante {
	
	//Atributos - segurança(private):

	private int matricula;
	private String cpf;
	public String nome;
	private double pontos;
	private boolean status;
	
	//construtores:
	public Estudante(int matricula, String cpf) { //construtor da regra
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}
	
	//sobrecarga de construtor:
	public Estudante(int matricula, String cpf, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}
	
	//encapsulamento - getters and setters:
	
	public Estudante(int matricula, String cpf, double pontos, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getPontos() {
		return pontos;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/*
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	*/
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	//metodos:

	public void adicionarNota(double pontos) {
		this.pontos = this.pontos + pontos;
	}
	
	public void tirarNota(double pontos) {
		this.pontos = this.pontos - pontos;
	}
	
	//
	
}
