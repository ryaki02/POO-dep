/* Elaborar um programa com uma classe Pessoa como classe
abstrata. Construa a classe para Pessoa F�sica e outra classe
para Pessoa Juridica. A classe Pessoa possui um c�digo (long)
e um nome (String). Na classe PessoaFisica crie os atributos
cpf(String), cargo (String) e salario (double). Na classe
PessoaJuridica crie os atributos cnpj (String), ramo de
atua��o (String). Crie os m�todos get e set para cada
atributo de todas as classes. Na classe principal que possui
o m�todo main, crie um objeto pessoa f�sica e outro da pessoa
jur�dica. */

package Questao2;

public class Principal {
	
	public static void main (String[]args) {
		
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
	}

}
