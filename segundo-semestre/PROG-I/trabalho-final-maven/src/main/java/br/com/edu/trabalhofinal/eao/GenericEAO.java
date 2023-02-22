package br.com.edu.trabalhofinal.eao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author MATHEUS.BIASI
 *
 */

public abstract class GenericEAO<E> implements IGenericEAO<E> {

	private static String nomeDb = "jdbc:sqlite:banco.db";

	protected static Connection conn;
	
	@Override
	public void connect() {
		try {
			conn = DriverManager.getConnection(nomeDb);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Override
	public void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	public static String getNomeDb() {
		return nomeDb;
	}

	public static Connection getConn() {
		return conn;
	}
}
