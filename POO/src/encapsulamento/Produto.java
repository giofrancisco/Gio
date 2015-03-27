package encapsulamento;

public class Produto {

	private int codigo;
	private String descricao;
	private double preco;

	public Produto(int cod, String Desc, double pre) {
		this.codigo = cod;
		this.descricao = Desc;
		this.preco = pre;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String setDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public double setPreco() {
		return preco;
	}

}
