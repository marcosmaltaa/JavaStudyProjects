package Modelo;

public class ProdutoLimpeza extends Produto{

	public ProdutoLimpeza(Integer quatidade, String nome, String descricao, String categoria, Double precoV,
			Double precoC) {
		this.quantidade = quatidade;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.precoVenda = precoV;
		this.precoCusto = precoC;
		
	}

}
