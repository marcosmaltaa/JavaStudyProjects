package trabUm;

import java.util.List;

public class Pedido {
	private String nomeCliente;
	private List<Itens> item;
	private Double taxa;
	
	public Pedido () {
		
	}
	
	public Pedido (String nomeCliente, List<Itens> item, Double taxa) {
		this.nomeCliente = nomeCliente;
		this.item = item;
		this.taxa = taxa;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nome) {
		this.nomeCliente = nome;
	}

	public List<Itens> getItem() {
		return item;
	}

	public void setItem(List<Itens> item) {
		this.item = item;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public void gerarNota() {
		System.out.println("Nota fiscal");	
		System.out.println("Nome: " + nomeCliente);
		System.out.println("Itens: ");
		Double soma = 0.0;
		for (Itens item : item) {
            System.out.println("- " + item.getNome() + " "+  item.getPrecoVenda());
            soma += item.getPrecoVenda();
        }
		soma = soma + taxa;
		System.out.println("Valor da compra (incluso taxa) -> " + soma);
		
	}
	
	public void calcularTroco(Double valorRecebido) {
		Double soma = 0.0;
		for (Itens item : item) {
            soma += item.getPrecoVenda();
        }
		System.out.println("Valor do troco:");
		System.out.println(valorRecebido - soma);
	}

	
}
