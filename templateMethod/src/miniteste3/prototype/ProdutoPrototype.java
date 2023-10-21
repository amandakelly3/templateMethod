package miniteste3.prototype;

import miniteste3.Produto;

public class ProdutoPrototype {

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
		
		public Produto(Produto old) {
			this.nome = old.nome;
			this.codigo = old.codigo;
			this.valorunitario = old.impostoFederal;
			this.impostoFederal = old.impostoFederal;

		}
		
		public Produto clone() {
			return new Produto(this);
		}

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

		public double getImpostoFederal() {
			return impostoFederal;
		}

		

}
}