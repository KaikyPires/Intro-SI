programa
{
	
	funcao inicio()
	{
	//variavel
	cadeia nomedofuncionario
	real salariofixo, totaldevendas, comissao, salariorecebido

	escreva("Digite o nome do funcionario: ")
	leia(nomedofuncionario)
	escreva("Digite o salario fixo do funcionario: ")
	leia(salariofixo)
     escreva("Digite valor total das vendas: ")
     leia(totaldevendas)

     comissao = (0.10)

     salariorecebido = (salariofixo + totaldevendas * comissao)

     escreva("\nO salario recebido no final do mês é ",salariorecebido,".")
     leia(salariorecebido)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */