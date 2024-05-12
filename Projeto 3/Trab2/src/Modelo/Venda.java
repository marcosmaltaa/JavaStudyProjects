package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
	private Cliente cliente;
	private ArrayList<Produto> produto;
	private FormaPagamento pagamento;
	private Date data_compra;
	
	public Venda(Cliente cliente, ArrayList<Produto> produto, FormaPagamento pagamento, Date data_compra) {
		this.cliente = cliente;
		this.produto = produto;
		this.pagamento = pagamento;
		this.data_compra = data_compra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Produto> getProduto() {
		return produto;
	}

	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}

	public FormaPagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(FormaPagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Date getData_compra() {
		return data_compra;
	}

	public void setData_compra(Date data_compra) {
		this.data_compra = data_compra;
	}
	
	

}
