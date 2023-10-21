package miniteste3;

public class Feijao extends Produto {
	
	private String publicoAlvo;

	public Feijao(String nome, int codigo, double valorunitario, double impostoFederal) {
		super(nome, codigo, valorunitario, impostoFederal);
		
	}

	@Override
	protected int getImpostoMunicial() {
		return 0;
	}

	@Override
	protected int getImpostoFederal() {
		return 5;
	}

}
