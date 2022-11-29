package Decorator;

public class main {

	public static void main(String[] args) {

		Forma circulo = new Circulo();
		Forma retangulo = new Retangulo();
		
		Forma circuloVermelho = new FormaVermelhaDecorator(new Circulo());
		Forma retanguloVermelho = new FormaVermelhaDecorator(new Retangulo());
		
		System.out.println("Círculo normal: ");
		circulo.desenhar();
		System.out.println("\nRetângulo normal: ");
		retangulo.desenhar();
		System.out.println("\nCírculo vermelho: ");
		circuloVermelho.desenhar();
		System.out.println("\nRetângulo vermelho: ");
		retanguloVermelho.desenhar();
	}

}
