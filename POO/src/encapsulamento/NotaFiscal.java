package encapsulamento;

import java.io.ObjectInputStream.GetField;
import java.util.Set;

public class NotaFiscal {
	
	private int numero;
	private String data;
	
	private Vendedor vendedor;
	private Produto[] produto;
	
	public NotaFiscal(int numero, String data, Vendedor vendedor) {
		this.numero = numero;
		this.data = data;
		this.vendedor = vendedor;
	}

	public Produto[] getProduto() {
		return produto;
	}

	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}

	public int getNumero() {
		return numero;
	}

	public String getData() {
		return data;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}
	
	private boolean existeEspacoNoVetor(){
		for(int i = 0; i < 10; i++){
			if (produto [i] == null)
				return  true;
		}
		return false;
	}
		
	private boolean produtoJaExiste(Produto p){
		Produto temporario = null;
		for (int i=0; i < 10; i++){
			temporario = produto[i];
			if (temporario != null)
			if (temporario.getCodigo()== p.getCodigo())
				return true;
		}	
		return false;
	}
	public boolean adiconarProdutos(Produto p){
		if (existeEspacoNoVetor()== true){
			if (produtoJaExiste(p)==false){
				for (int i = 0; i < 10; i++){
					if (produto[i] == null){
						produto[i] = p;
						return true;
					}
				}
				
			}
		}
		return false;
	}
	public double somarProdutos(){
		double soma = 0;
		for (int i = 0; i < 10; i++){
		
		}
		return soma;
	}
	}
	
	
	
	
	
	
	
	
	


