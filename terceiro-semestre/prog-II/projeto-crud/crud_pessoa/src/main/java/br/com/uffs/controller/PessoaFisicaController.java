package br.com.uffs.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.uffs.dao.PessoaFisicaDAO;
import br.com.uffs.model.PessoaFisica;

@Named
@ViewScoped
public class PessoaFisicaController implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Inject
	private PessoaFisicaDAO pessoaFisicaDAO;
	
	private List<PessoaFisica> pessoaFisicaList;
	
	private PessoaFisica pessoaFisica;

	@PostConstruct
	public void init() {
		pessoaFisicaList = new ArrayList<>();
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Matheus");
		pf.setNomeSocial("Matheus Biasi");
		pf.setIdade(22L);
		pessoaFisicaList.add(pf);
		
		
	}
	
	public void salvar() {
		System.out.println("Cliente salvo");
	}
	
	public void remover() {
		System.out.println("Remover");
	}
	
	public void novoCadastro() {
		System.out.println("cadastrando novo Cliente");
		this.pessoaFisica =  new PessoaFisica();
	}
	
	
	
	
	
	
	

	public PessoaFisicaDAO getPessoaFisicaDAO() {
		return pessoaFisicaDAO;
	}

	public void setPessoaFisicaDAO(PessoaFisicaDAO pessoaFisicaDAO) {
		this.pessoaFisicaDAO = pessoaFisicaDAO;
	}


	public List<PessoaFisica> getPessoaFisicaList() {
		return pessoaFisicaList;
	}

	
	public void setPessoaFisicaList(List<PessoaFisica> pessoaFisicaList) {
		this.pessoaFisicaList = pessoaFisicaList;
	}










	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}










	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

}
