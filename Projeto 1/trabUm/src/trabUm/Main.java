package trabUm;

import java.util.Date;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pizza queijo = new Pizza("Queijo", "Tomate", "Cheedar", false,"Pizza de Queijo", 23.50, new Date(), 5.2);
		Pizza marguerita = new Pizza("Marguerita", "Tomate", "Frango", false, "Pizza de Marguerita", 34.50, new Date(),5.6);
		
		Lanche lanche1 = new Lanche("Brioche", "x-tudo", "Barbecue","X-tudo", 22.20, new Date(), 0.6);
		
		Salgado salgadoAssado = new Salgado("Assado", "Macia", "Frango","Salgado Assado de Frango", 6.00, new Date(), 0.5);
		
		ArrayList<Itens> cliente1 = new ArrayList();
		cliente1.add(queijo);
		cliente1.add(lanche1);		
		
		ArrayList<Itens> cliente2 = new ArrayList();
		cliente2.add(marguerita);
		cliente2.add(salgadoAssado);
		
		
		Pedido p1 = new Pedido("Alex", cliente1, 5.00);
		Pedido p2 = new Pedido("Cesar", cliente2, 2.50); 
		
		p1.gerarNota();
		p1.calcularTroco(60.0);
		
		System.out.println("#########################################################");
		
		p2.gerarNota();
		p2.calcularTroco(30.0);
		

	}
}
