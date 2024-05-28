package Visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ProdutoView extends JFrame implements ActionListener{

	private JLabel labelCodigo, labelQuantidade, labelNome, labelDescricao, labelCategoria, labelPrecoVenda,labelPrecoCusto;
    public JButton buttonCadastro, buttonEditar, buttonRemover, buttonBuscarNome, buttonBuscarID, buttonBuscarCategoria;
    public JTextField fieldCodigo, fieldQuantidade, fieldNome, fieldDescricao, fieldPrecoVenda, fieldPrecoCusto;
    public JRadioButton rad1, rad2, rad3;
    
	public ProdutoView() {
		labelCodigo = new JLabel("Codigo:");
        labelCodigo.setBounds(10, 40, 80, 25);
        add(labelCodigo);
        
        labelNome = new JLabel("Nome:");
        labelNome.setBounds(10, 70, 80, 25);
        add(labelNome);
        
        labelQuantidade = new JLabel("Quantidade:");
        labelQuantidade.setBounds(10, 100, 80, 25);
        add(labelQuantidade);
        
        labelDescricao = new JLabel("Descricao:");
        labelDescricao.setBounds(10, 130, 80, 25);
        add(labelDescricao);
        
        labelCategoria = new JLabel("Categoria:");
        labelCategoria.setBounds(10, 160, 80, 25);
        add(labelCategoria);
        
        labelPrecoVenda = new JLabel("Preco Venda:");
        labelPrecoVenda.setBounds(10, 190, 80, 25);
        add(labelPrecoVenda);
        
        labelPrecoCusto = new JLabel("Custo:");
        labelPrecoCusto.setBounds(10, 220, 80, 25);
        add(labelPrecoCusto);
        
        
     // Criando e posicionando os campos de texto
        fieldCodigo = new JTextField();
        fieldCodigo.setBounds(90, 40, 200, 25);
        add(fieldCodigo);
        
        fieldNome = new JTextField();
        fieldNome.setBounds(90, 70, 200, 25);
        add(fieldNome);
        
        fieldQuantidade = new JTextField();
        fieldQuantidade.setBounds(90, 100, 200, 25);
        add(fieldQuantidade);
        
        fieldDescricao = new JTextField();
        fieldDescricao.setBounds(90, 130, 200, 25);
        add(fieldDescricao);
        
        fieldPrecoVenda = new JTextField();
        fieldPrecoVenda.setBounds(90, 190, 200, 25);
        add(fieldPrecoVenda);
        
        fieldPrecoCusto = new JTextField();
        fieldPrecoCusto.setBounds(90, 220, 200, 25);
        add(fieldPrecoCusto);
        
     // Criando e posicionando os Radio 
        rad1 = new JRadioButton("Alimento");
        rad2 = new JRadioButton("Eletronico");
        rad3 = new JRadioButton("Limpeza");
        
        rad1.setBounds(90, 160, 100, 25);
        rad2.setBounds(250, 160, 100, 25);
        rad3.setBounds(410, 160, 100, 25);
       
        ButtonGroup categoriasProduto = new ButtonGroup();
        categoriasProduto.add(rad1);
        categoriasProduto.add(rad2);
        categoriasProduto.add(rad3);
        
        add(rad1);
        add(rad2);
        add(rad3);
        
        setLayout(null);
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
