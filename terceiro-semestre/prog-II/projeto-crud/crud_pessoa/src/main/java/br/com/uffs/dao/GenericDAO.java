package br.com.uffs.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 
 * @author matheuspalacios
 *
 */

@Stateless
public abstract class GenericDAO<T,ID> implements Serializable {
	
	private static final long serialVersionUID = 1L;

	EntityManager entityManager;
	
	public Class<T> clazz;
	
	public GenericDAO(Class<T> clazz) {
		this.clazz = clazz;
		this.entityManager = EntityManagerBuil.getEntityManager();
	}
	
	public void cadastrar(T entidade) {
		entityManager.persist(entidade);
	}
	
	public void atualizar(T entidade) {
		entityManager.merge(entidade);
	}
	
	public void deletar(ID idEntidade) {
		T entidade = entityManager.find(clazz, idEntidade);
		entityManager.remove(entidade);
	}
	
	public T buscarById(ID idEntidade) {
		return entityManager.find(clazz, idEntidade);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> buscarTodos(){
		return entityManager.createQuery(" select entidade from " + clazz.getSimpleName() 
		+ " entidade ").getResultList();
	}

}
