package Modelo;

public class ProdutoEletronico extends Produto {
	
	public ProdutoEletronico(Integer codigo, Integer quatidade, String nome, String descricao, String categoria, Double precoV,
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
