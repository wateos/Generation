package lista5classes;

import java.util.Scanner;

public class Tarefa1MainCliente {

	public static void main(String[] args) {
		
		Tarefa1ClasseCliente cliente1 = new Tarefa1ClasseCliente();
		Scanner leiaInt = new Scanner(System.in);
		Scanner leiaStrg= new Scanner(System.in);
	
		cliente1.exibeDados();
		System.out.println("Para cadastrar cliente informe o nome, idade, cpf, cel, endereço e email do cliente, nesta ordem respectivamente:");
		cliente1.cadastarCliente(leiaStrg.nextLine(), leiaInt.nextInt(), leiaInt.nextInt(), leiaInt.nextInt(),leiaStrg.nextLine(), leiaStrg.nextLine());
		cliente1.exibeDados();
		cliente1.excluirCadastro();
		cliente1.exibeDados();

	}

}
