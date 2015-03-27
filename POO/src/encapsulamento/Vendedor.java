package encapsulamento;

public class Vendedor {

	private String nome;
	private String cpf;

	public Vendedor(String Nome, String CPF) {
		this.nome = Nome;
		this.cpf = CPF;
	}

	public String getNome() {
		return nome;
	}

	public String setNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
}
