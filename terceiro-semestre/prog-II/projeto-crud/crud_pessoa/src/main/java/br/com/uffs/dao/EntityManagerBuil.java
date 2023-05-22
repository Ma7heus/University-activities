package br.com.uffs.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerBuil {
	
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PostgresDS");
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

}
