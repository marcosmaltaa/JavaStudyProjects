package Visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import Controle.ClienteControle;
import DAO.ClienteDAO;
import DAO.ConexaoDAO;

public class TelaMenuView extends JFrame implements ActionListener {

    public JButton buttonCadastroCliente, buttonCadastroProduto, buttonCadastroVenda;


    public TelaMenuView() {
        super("Menu");
        
        // Criando e posicionando o botÃ£o 
        buttonCadastroCliente = new JButton("Cliente");
        buttonCadastroCliente.setBounds(10, 10, 100, 25);
        buttonCadastroCliente.addActionListener(this); 
        add(buttonCadastroCliente);
        
        buttonCadastroProduto = new JButton("Produto");
        buttonCadastroProduto.setBounds(120, 10, 100, 25);
        buttonCadastroProduto.addActionListener(this); 
        add(buttonCadastroProduto);

        buttonCadastroVenda = new JButton("Venda");
        buttonCadastroVenda.setBounds(250, 10, 100, 25);
        buttonCadastroVenda.addActionListener(this); 
        add(buttonCadastroVenda);
        
        // Definindo layout e propriedades da tela
        setLayout(null);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() ==  buttonCadastroCliente) {
    		ClienteView clienteView = new ClienteView();
    		ClienteDAO clienteDAO = new ClienteDAO(ConexaoDAO.obterConexao());
    		ClienteControle clienteControle = new ClienteControle(clienteDAO, clienteView);
    	}
    	else if(e.getSource()== buttonCadastroProduto) {
    		ProdutoView produtoView = new ProdutoView();
    	}
    }
    
    public static void main(String[] args) {
    	TelaMenuView telaMenu = new TelaMenuView();
    }

}



