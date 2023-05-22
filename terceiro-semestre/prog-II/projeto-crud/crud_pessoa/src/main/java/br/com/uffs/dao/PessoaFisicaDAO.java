package br.com.uffs.dao;

import java.util.List;

import br.com.uffs.model.PessoaFisica;

public class PessoaFisicaDAO extends GenericDAO<PessoaFisica, Long> {

	private static final long serialVersionUID = 1L;

	public PessoaFisicaDAO() {
		super(PessoaFisica.class);
	}

	public static void main(String[] args) {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		
		List<PessoaFisica> list = dao.buscarTodos();
		
		System.out.println(list);
	}
	
	
}
