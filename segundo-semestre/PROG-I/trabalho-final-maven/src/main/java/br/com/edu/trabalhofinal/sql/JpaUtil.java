package br.com.edu.trabalhofinal.sql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("DB_JDBC_SQLITE");
	static EntityManager em = emFactory.createEntityManager();
	
	
	
	public static void teste() {
		System.out.println("Iniciando consulta");
		em.getTransaction().begin();
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(2L);
		usuario.setNome("PEDRO");
		em.persist(usuario);
		
		em.getTransaction().commit();
		em.close();
	

		
		System.out.println("finalizando consulta");
	}
	
	public static void main(String[] args) {
		teste();
	}


}
