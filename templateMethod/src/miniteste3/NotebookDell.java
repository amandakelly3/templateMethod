package miniteste3;

public class NotebookDell extends Produto {
	
	private String publicoAlvo;

	public NotebookDell(String nome, int codigo, double valorunitario, double impostoFederal) {
		super(nome, codigo, valorunitario, impostoFederal);
	}

	@Override
	protected int getImpostoMunicial() {
		return 2;
	}

	@Override
	protected int getImpostoFederal() {
		return 5;
	}

}
