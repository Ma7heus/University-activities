package br.com.uffs.trabalhoFinal.Enums;

public enum EnumModelo {

	MODELO_1("MODELO 1"),
	MODELO_2("MODELO 2"),
	MODELO_3("MODELO 3"),
	;

	private String descricao;
	
	private EnumModelo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}



}
