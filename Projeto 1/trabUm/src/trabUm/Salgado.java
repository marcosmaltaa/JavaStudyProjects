package trabUm;

import java.util.Date;

public class Salgado extends Itens {
	private String tipoSalgado;
	private String massa;
	private String recheio;
	
	public Salgado (String nome,Double preco, Date data_validade, Double peso) {
		super(nome, preco, data_validade, peso);
	}
	
	public Salgado (String tipoSalgado, String massa, String recheio,String nome, Double preco, Date data_validade, Double peso) {
		super(nome, preco, data_validade, peso);
		this.tipoSalgado = tipoSalgado;
		this.massa = massa;
		this.recheio = recheio;
	}

	public String getTipoSalgado() {
		return tipoSalgado;
	}

	public void setTipoSalgado(String tipoSalgado) {
		this.tipoSalgado = tipoSalgado;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
}
