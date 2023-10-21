package miniteste3;

public abstract class Produto {

	private String nome;
	private int codigo;
	private double valorunitario;
	private double impostoFederal;

	public Produto(String nome, int codigo, double valorunitario, double impostoFederal) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.valorunitario = valorunitario;
		this.impostoFederal = impostoFederal;
	}

	public double imposto(String publicoAlvo) {
		if (publicoAlvo.equalsIgnoreCase("R")) {
			return valorunitario + (getImpostoFederal() + getImpostoMunicial());
		} else if (publicoAlvo.equalsIgnoreCase("M")) {
			return valorunitario + (getImpostoFederal() + getImpostoMunicial());
		} else if (publicoAlvo.equalsIgnoreCase("P")) {
			return valorunitario + (getImpostoFederal());
		}
		return valorunitario + getImpostoFederal();
	}

	protected abstract int getImpostoMunicial();

	protected abstract int getImpostoFederal();


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(double valorunitario) {
		this.valorunitario = valorunitario;
	}

}
