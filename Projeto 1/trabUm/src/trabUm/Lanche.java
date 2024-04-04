package trabUm;

import java.util.Date;

public class Lanche extends Itens{
	private String tipoPao;
	private String recheio;
	private String molho;
	
	public Lanche(String nome, Double preco, Date dataValidade, Double peso) {
		super(nome, preco, dataValidade, peso);
	}
	
	public Lanche(String pao, String recheio, String molho,String nome, Double preco, Date dataValidade, Double peso) {
		super(nome, preco, dataValidade, peso);
		this.tipoPao = pao;
		this.recheio = recheio;
		this.molho = molho;
	}
	
	public String getTipoPao () {
		return tipoPao;
	}
	
	public void setTipoPao (String pao) {
		this.tipoPao = pao;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
}
