package br.com.uffs.trabalhoFinal;

import java.io.Serializable;

public class Modelo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idModelo;

    private String descricao;

	public Long getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Long idModelo) {
		this.idModelo = idModelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
