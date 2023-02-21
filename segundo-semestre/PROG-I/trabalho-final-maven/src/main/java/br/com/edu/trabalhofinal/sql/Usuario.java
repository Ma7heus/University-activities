package br.com.edu.trabalhofinal.sql;

/**
 * 
 * @author biasi
 *
 */

public class Usuario {
	
	private Long idUsuario;
	
	private String nome;
	
	private String cpf;

	public Usuario(Long idUsuario, String nome) {
		this.idUsuario = idUsuario;
		this.nome = nome;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
