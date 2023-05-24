package br.com.uffs.dao;

public class QueryPessoaFisica {
	
	public String getAllPessoaFisica() {
		StringBuilder query = new StringBuilder();
	
		query.append(" SELECT IDPESSOAFISICA, ");
		query.append(" NOME, NOMESOCIAL, CPF, ALTURA, MASSA, GENERO, IDADE, EMAIL, TELEFONE, ENDERECO  ");
		query.append(" FROM PESSOAFISICA ");
	
		return query.toString();
	}

	public String findById() {
		
		StringBuilder query = new StringBuilder();
		
		query.append(" WHERE IDPESSOAFISICA = ? ");

		return getAllPessoaFisica() + query;
	}

}
