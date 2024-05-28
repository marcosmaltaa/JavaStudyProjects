package DAO;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Modelo.Produto;

public class ProdutoDAO {
private Connection conexao;
	
	public ProdutoDAO(Connection c) {
		this.conexao = c;
	}
	
	public void cadastrarProduto(Produto produto) throws SQLException {
		String query = "INSERT INTO produto(nome, descricao, preco_custo, preco_venda, quatidade, categoria) VALUES (?,?,?,?,?,?)";
		try (PreparedStatement stmt = conexao.prepareStatement(query)){
			stmt.setString(1,  produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPrecoCusto());
			stmt.setDouble(4, produto.getPrecoVenda());
			stmt.setInt(5, produto.getQuantidade());
			stmt.setString(6, produto.getCategoria());
			stmt.executeUpdate();
		}
	}
	
	public void consultarProdutoCodigo(Integer codigo) throws SQLException{
		String query = "SELECT nome, quantidade FROM produto WHERE codigo_produto = ?";
		try (PreparedStatement stmt = conexao.prepareStatement(query)){
			stmt.setInt(1, codigo);
			try(ResultSet resultado = stmt.executeQuery()){
				while(resultado.next()) {
					String nome = resultado.getString("nome");
					Integer quantidade = resultado.getInt("quantidade");
				
					JOptionPane.showMessageDialog(null, "Codigo: " + codigo +"\nNome: " + nome + "\nQuantidade: " + quantidade);
				}
				}
			}
		}
	
	public void editarProduto(Produto produto, Integer codigo) throws SQLException{
		String query = "UPDATE produto SET nome=?, descricao=?, preco_custo=?, preco_venda=?, quantidade=?, categoria=? Where codigo_produto = ?";
		try(PreparedStatement stmt = conexao.prepareStatement(query)){
			stmt.setString(1,  produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPrecoCusto());
			stmt.setDouble(4, produto.getPrecoVenda());
			stmt.setInt(5, produto.getQuantidade());
			stmt.setString(6, produto.getCategoria());
			stmt.setInt(7, codigo);
			stmt.executeUpdate();
		}
	}
		
	public void removerProduto(Integer codigo) throws SQLException{
	
		String query = "DELETE FROM produto WHERE codigo_produto=?";
		try(PreparedStatement stmt = conexao.prepareStatement(query)){
			stmt.setInt(1,  codigo);
			stmt.executeUpdate();
	}
	
	}
	
	}
	
