package Modelo;

public class ProdutoAlimenticio extends Produto{
	
	public ProdutoAlimenticio(Integer codigo, Integer quatidade, String nome, String descricao, String categoria, Double precoV,
			Double precoC) {
		
		this.codigo = codigo;
		this.quantidade = quatidade;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.precoVenda = precoV;
		this.precoCusto = precoC;
		
	}

}
