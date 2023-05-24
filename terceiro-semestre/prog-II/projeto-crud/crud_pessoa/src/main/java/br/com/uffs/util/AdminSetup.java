package br.com.uffs.util;

import javax.inject.Inject;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.uffs.dao.PessoaFisicaDAO;

//Executa classe uma única vez ao iniciar a aplicação no servidor
//Recurso usado para criar o primeiro usuário ADMINISTRADOR no sistema, se o mesmo não existir ainda
@WebListener
public class AdminSetup implements ServletContextListener {

	@Inject
    private Pbkdf2PasswordHash passwordHash;

    @Inject
    private PessoaFisicaDAO pessoaFisicaDAO;
    
  
}
