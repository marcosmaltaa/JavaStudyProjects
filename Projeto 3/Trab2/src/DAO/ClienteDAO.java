package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Modelo.Cliente;

public class ClienteDAO {
	private Connection conexao;
	
	public ClienteDAO(Connection c) {
		this.conexao = c;
	}
	
	public void cadastrarCliente(Cliente cliente) throws SQLException{
		String query = "INSERT INTO cliente(cpf, nome, email, data_nasc) VALUES(?,?,?,?)";
		
		try (PreparedStatement stmt = conexao.prepareStatement(query)){
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getEmail());
			stmt.setDate(4, new java.sql.Date(cliente.getData_nasc().getTime()));
			stmt.executeUpdate();
		}
	}
	
	public void editarCliente(Cliente cliente) throws SQLException{
		String query = "UPDATE cliente SET nome=?, email=?, data_nasc=? WHERE cpf=? ";
		
		try (PreparedStatement stmt = conexao.prepareStatement(query)){
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setDate(3, new java.sql.Date(cliente.getData_nasc().getTime()));
			stmt.setString(4, cliente.getCpf());
			stmt.executeUpdate();
		}
	}
	
	public void removerCliente(String cpf) throws SQLException{
		String query = "DELETE FROM cliente WHERE cpf=?";
		
		try (PreparedStatement stmt = conexao.prepareStatement(query)){
			stmt.setString(1, cpf);
			stmt.executeUpdate();
		}
	}
}
