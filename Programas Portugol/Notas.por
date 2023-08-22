programa
{
	
	funcao inicio()
	{
	//declarar variável
	real primeiranota, segundanota, terceiranota, media
	cadeia nomedoaluno

	escreva ("Digite seu nome: ")
	leia (nomedoaluno)
	escreva ("Digite a primeira nota: ")
	leia (primeiranota)
	escreva ("Digite segunda nota: ")
	leia (segundanota)
	escreva("Digite terceira nota: ")
	leia (terceiranota)

     media = (primeiranota + segundanota + terceiranota)

     escreva(nomedoaluno + " sua media é: " + media)
     se (media >=18)
     escreva ("\nParabéns, você foi aprovado")
     se (media <18)
     escreva ("\nReprovado, estude mais")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 602; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */