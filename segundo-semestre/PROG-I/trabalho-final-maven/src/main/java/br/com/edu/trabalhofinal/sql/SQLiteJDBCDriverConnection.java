package br.com.edu.trabalhofinal.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.jboss.jandex.Main;

/**
 * 
 * @author Matheus Biasi
 *
 */

public class SQLiteJDBCDriverConnection {

	private static String nomeDb = "jdbc:sqlite:banco.db";

	private static Connection conn;

	private static void connect() {
		try {
			conn = DriverManager.getConnection(nomeDb);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void disconnect() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void criandotabela() throws SQLException {
		connect();

		Statement statement = conn.createStatement();

		String sql = "CREATE TABLE USUARIO (IDUSUARIO INTEGER PRIMARY KEY, NOME TEXT)";
		statement.executeUpdate(sql);
		System.out.println("Tabela criada");
		
		disconnect();
	}
	
	public static void insert() throws SQLException {
		
		connect();
		
		Statement statement = conn.createStatement();
		
		String sql = " INSERT INTO USUARIO (IDUSUARIO, NOME) VALUES('1','MATHEUS')";
		statement.executeUpdate(sql);
		System.out.println("Valores inseridos");
	
		disconnect();
	}
	
	
	public static void main(String[] args) throws SQLException {
		//criandotabela();
		insert();
		
	}
	

}
