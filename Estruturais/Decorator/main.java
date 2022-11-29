package Decorator;

public class main {

	public static void main(String[] args) {

		Forma circulo = new Circulo();
		Forma retangulo = new Retangulo();
		
		Forma circuloVermelho = new FormaVermelhaDecorator(new Circulo());
		Forma retanguloVermelho = new FormaVermelhaDecorator(new Retangulo());
		
		System.out.println("C�rculo normal: ");
		circulo.desenhar();
		System.out.println("\nRet�ngulo normal: ");
		retangulo.desenhar();
		System.out.println("\nC�rculo vermelho: ");
		circuloVermelho.desenhar();
		System.out.println("\nRet�ngulo vermelho: ");
		retanguloVermelho.desenhar();
	}

}
