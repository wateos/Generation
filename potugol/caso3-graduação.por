programa
{
	
	funcao inicio()
	{	
		//váriaveis auxiliares que usei:
		inteiro opcao = 0
		cadeia escolaNome = "[NOME DA ESCOLA]"
		cadeia slogan = "[SLOGAN]"
		caracter movimento
		caracter continuar
		real valorMovimento
		inteiro i
		real bonus = 2.0
		
		inteiro matricula = 0
		cadeia cpf
		real pontos = 0.0
		logico status = verdadeiro

		//Sujestão de alteração para layout:
		escreva(escolaNome,"\n")
		escreva(slogan,"\n\n")
		
		escreva("1 - BASICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR\n\n","DIGITE O CODIGO DA OPÇÃO DESEJADA: ")
		leia (opcao)
 		
 		escolha(opcao){
			caso(1):
			{
				pare
			}
			caso(2):
			{
				pare		
			}
			caso(3):
			{	
				escreva("\n",escolaNome,"\n")
				escreva(slogan,"\n\n")
				escreva("ENSINO[GRADUAÇÃO]\n\n")
				escreva("Matricula:")
				leia(matricula)
				escreva("CPF:")
				leia(cpf)
				se (status) escreva("Status: 1-Ativa\n")
				senao{ escreva("Status: 2-Inativa")
				      escreva("\n impossível registar nota do aluno! Até breve!!\n\n")
				}
				para(i = 0; i<10; i++){
					escreva("\nTotal atual: ", pontos)
					escreva("\nMOVIMENTO - I-inclusão de nota ou R-retirada nota: ")
					leia(movimento)
					se(movimento == 'I'){
						escreva("Valor movimento: ")
						leia(valorMovimento)
						pontos = pontos + valorMovimento
					}senao se(movimento == 'R'){
						escreva("Valor movimento: ")
						leia(valorMovimento)
						pontos = pontos - valorMovimento
					}
					escreva("Continuar S/N:")
					leia(continuar)
					se(continuar == 'N'){
						escreva("\n[Volte a utilizar nosso programa quando necessário! Até breve!!]\n\n")
						pare
					}
				}
				se(pontos < 0){
					pontos = pontos + bonus
					bonus = 0.0

					se (pontos < 0)
						pontos = 0.0
				}
				//}senao se (pontos 
			     
				se (i==10) escreva("\n[Volte a utilizar nosso programa quando necessário! Até breve!!]\n\n")	 
				pare
			}
			caso(4):
			{	
				pare
			}
			caso(5):
			{		
				pare
			}
			caso(6):
			{
				escreva("\n[Volte a utilizar nosso programa quando necessário! Até breve!!]\n\n")
				pare
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1678; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */