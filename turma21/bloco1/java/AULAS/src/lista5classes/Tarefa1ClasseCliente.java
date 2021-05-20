package lista5classes;

public class Tarefa1ClasseCliente {
		
		private String nome = null;
		private int idade = 0;
		private int cpf = 0;
		private int cel = 0;
		private String endereco = null;
		private String email = null;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getCpf() {
			return cpf;
		}
		public void setCpf(int cpf) {
			this.cpf = cpf;
		}
		public int getCel() {
			return cel;
		}
		public void setCel(int cel) {
			this.cel = cel;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void excluirCadastro() {
			
				if (this.nome == null) {
					System.out.println("\nNão Há cliente cadastrado!\n");
				}
				else {
					setNome(null);
					setIdade(0);
					setCpf(0);
					setCel(0);
					setEmail(null);
					setEndereco(null);	
					System.out.println("Cadastro excluído com sucesso!");
				}
		}
		
		public void cadastarCliente(String nome, int idade , int cpf, int cel, String email, String endereco ) {
			
				setNome(nome);
				setIdade(idade);
				setCpf(cpf);
				setCel(cel);
				setEmail(email);
				setEndereco(endereco);	
		}
		
		public void exibeDados() {
			
			if(nome == null) System.out.println("\nNão Há cliente cadastrado!\n");
			else {
				System.out.println("CLIENTE CADASTRADO:\n");
				System.out.println("Nome: "+ getNome());
				System.out.println("Idade: "+ getIdade());
				System.out.println("CPF: "+ getCpf());
				System.out.println("cel: "+ getCel());
				System.out.println("Endereço: "+ getEndereco());	
				System.out.println("email: "+ getEmail()+"\n");	
			}
			
		}
	
}

