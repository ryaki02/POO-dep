/* Elaborar um programa com uma classe Ponto para que o programa
possa representar pontos. Cada ponto possui dois atributos
inteiros, um chamado x e outro chamado y como private.
Construa tamb�m uma classe Circulo que herda de Ponto e
possua o atributo raio. A classe Ponto deve possuir os
m�todos para alterar e pegar os valores dos atributos x e y
(get e set para cada atributo). Na classe c�rculo construa os
m�todos para alterar e pegar o raio. Utilize na classe
principal que possui o m�todo main, um objeto ponto e um
objeto circulo. */

package Questao1;

public class Ponto {
	
	private int x, y;
	
	public int getX() {
		return x;
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY (int y) {
		this.y = y;
	}

}
