package Modelo;

public abstract class FormaPagamento {
	protected Double valoPago;
	protected String tipo;
	
	
	public Double getValoPago() {
		return valoPago;
	}
	public void setValoPago(Double valoPago) {
		this.valoPago = valoPago;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
