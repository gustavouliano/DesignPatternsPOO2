package Decorator;

public class FormaVermelhaDecorator extends FormaDecorator{

	public FormaVermelhaDecorator(Forma forma) {
		super(forma);
	}
	
	public void desenhar() {
		super.desenhar();
		this.setBordaVermelha();
	}
	
	private void setBordaVermelha() {
		System.out.println("Border Color: Red");
	}

}
