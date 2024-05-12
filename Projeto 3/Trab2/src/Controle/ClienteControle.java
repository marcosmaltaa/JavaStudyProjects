package Controle;

import DAO.ClienteDAO;
import Modelo.Cliente;
import Visao.ClienteView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ClienteControle implements ActionListener {
	private ClienteDAO clienteDAO;
	private ClienteView clienteView;
	
	public ClienteControle(ClienteDAO clienteDAO, ClienteView clienteView) {
		super();
		this.clienteDAO = clienteDAO;
		this.clienteView = clienteView;
		
		this.clienteView.buttonCadastro.addActionListener(this);
		this.clienteView.buttonEditar.addActionListener(this);
		this.clienteView.buttonRemover.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == clienteView.buttonCadastro) {
			cadastroCliente();
		}else if (e.getSource() == clienteView.buttonEditar) {
            editarCliente();
        } else if (e.getSource() == clienteView.buttonRemover) {
        	removerCliente();
        }
	}
	
	private void cadastroCliente() {
    	String cpf = clienteView.fieldCpf.getText();
        String nome = clienteView.fieldNome.getText();
        String email = clienteView.fieldEmail.getText();
        String dataTexto = clienteView.fieldData.getText();
        java.util.Date nascimento = null;
        

        try {
            SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            nascimento = data.parse(dataTexto);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(clienteView, "Formato inválido!");
            return;
        }

        Cliente cliente = new Cliente(nome, email, cpf, nascimento);

        try {
            clienteDAO.cadastrarCliente(cliente);
            JOptionPane.showMessageDialog(clienteView, "Cliente cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(clienteView, "Erro ao cadastrar cliente: " + ex.getMessage());
        }
    }
	
	private void editarCliente() {
		String cpf = clienteView.fieldCpf.getText();
        String nome = clienteView.fieldNome.getText();
        String email = clienteView.fieldEmail.getText();
        String dataTexto = clienteView.fieldData.getText();
        java.util.Date nascimento = null;
        

        try {
            SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            nascimento = data.parse(dataTexto);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(clienteView, "Formato inválido!");
            return;
        }

        Cliente cliente = new Cliente(nome, email, cpf, nascimento);

        try {
            clienteDAO.editarCliente(cliente);
            JOptionPane.showMessageDialog(clienteView, "Cliente editado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(clienteView, "Erro ao editar cliente: " + ex.getMessage());
        }
	}
	
	private void removerCliente() {
		String cpf = clienteView.fieldCpf.getText();
		
		try {
            clienteDAO.removerCliente(cpf);
            JOptionPane.showMessageDialog(clienteView, "Cliente removido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(clienteView, "Erro ao remover cliente: " + ex.getMessage());
        }
	}
	
	
}
