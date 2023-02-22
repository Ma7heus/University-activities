package br.com.edu.trabalhofinal.eao;

import java.sql.SQLException;
import java.util.List;

public interface IGenericEAO<E> {
	
	public void connect();
	
	public void disconnect();
	
	public void insert(E objeto) throws SQLException;
	
	public void update(E objeto) throws SQLException;
	
	public E find(Long id) throws SQLException;
	
	public List<E> findAll() throws SQLException;
	
	public void delete(E objeto) throws SQLException;

}
