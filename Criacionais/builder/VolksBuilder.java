package builder;

public class VolksBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.setPreco(43000.000);
	}

	@Override
	public void buildDscMotor() {
		carro.setDscMotor("1.6 Flex");
	}

	@Override
	public void buildAnoFabricacao() {
		carro.setAnoFabricacao(2017);
	}

	@Override
	public void buildModelo() {
		carro.setModelo("Gol");
	}

	@Override
	public void buildMontadora() {
		carro.setMontadora("Volks");
	}

}
