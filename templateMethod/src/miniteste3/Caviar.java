package miniteste3;

public class Caviar extends Produto {
	
	private String publicoAlvo;

	public Caviar(String nome, int codigo, double valorunitario, double impostoFederal) {
		super(nome, codigo, valorunitario, impostoFederal);
	}

	@Override
	protected int getImpostoMunicial() {
		return 3;
	}

	@Override
	protected int getImpostoFederal() {
		return 5;
	}

}
