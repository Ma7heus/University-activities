package br.com.uffs.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.uffs.dao.PessoaFisicaDAO;

@Named
@ViewScoped
public class TelaInicialController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private FacesContext facesContext;s
	
	@PostConstruct
	public void init() {
		
	}
	
	public void irParaCadastro() throws IOException {
		facesContext.getExternalContext().redirect("pessoa-fisica.xhtml");
	}
	
	
	
	
	
	
	
	
	
	public FacesContext getFacesContext() {
		return facesContext;
	}

	public void setFacesContext(FacesContext facesContext) {
		this.facesContext = facesContext;
	}

}
