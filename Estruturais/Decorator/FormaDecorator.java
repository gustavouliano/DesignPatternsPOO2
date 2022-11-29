package Decorator;

abstract public class FormaDecorator implements Forma{
	
	private Forma forma;
	
	public FormaDecorator(Forma forma) {
		this.forma = forma;
	}
	
	public Forma getForma() {
		return this.forma;
	}
	
	public void setForma(Forma forma) {
		this.setForma(forma);
	}
	
	public void desenhar() {
		forma.desenhar();
	}
}
