package Modelo;

import java.util.Date;

public class Cliente {
	private String nome, email;
	private Integer cpf;
	private Date data_nasc;
	
	public Cliente(String nome, String email, Integer cpf, Date data_nasc) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.data_nasc = data_nasc;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Date getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	

}
