package trabUm;

import java.util.Date;

public class Itens {
	private String nome;
	private Double preco_venda;
	private Date data_validade;
	private Double peso;

	public Itens (String nome, Double preco, Date dataV, Double peso) {
		this.nome = nome;
		this.preco_venda = preco;
		this.data_validade = dataV;
		this.peso = peso; 
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoVenda() {
		return preco_venda;
	}
	
	public void setPrecoVenda(Double preco) {
		this.preco_venda = preco;
	}

	public Date getData_validade() {
		return data_validade;
	}

	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
}
