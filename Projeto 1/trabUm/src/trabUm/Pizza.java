package trabUm;

import java.util.Date;

public class Pizza extends Itens{
	private String recheio;
	private String molho;
	private String borda;
	private Boolean bordaRecheada;
	
	public Pizza(String recheio, String molho, String borda, Boolean bordaRe,String nome, Double preco, Date dataValidade, 
			Double peso) {
		super(nome, preco, dataValidade, peso);
		this.recheio = recheio;
		this.molho = molho;
		this.borda = borda;
		this.bordaRecheada = bordaRe;
	}
	
	public Pizza(String nome, Double preco, Date dataValidade, Double peso) {
		super(nome, preco, dataValidade, peso);
		}
	
	public String getRecheioPizza() {
		return recheio;
	}
	
	public void setRecheioPizza(String recheio) {
		this.recheio = recheio;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

	public Boolean getBordaRecheada() {
		return bordaRecheada;
	}

	public void setBordaRecheada(Boolean bordaRecheada) {
		this.bordaRecheada = bordaRecheada;
	}
	
	
	}
