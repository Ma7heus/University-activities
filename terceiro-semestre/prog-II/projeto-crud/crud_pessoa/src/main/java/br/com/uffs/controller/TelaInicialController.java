package br.com.uffs.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TelaInicialController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	public void init() {
		
	}


}
