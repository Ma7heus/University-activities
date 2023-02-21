package br.com.edu.trabalhofinal.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

		Statement statement = createStatement();

		String sql = "CREATE TABLE USUARIO (IDUSUARIO INTEGER PRIMARY KEY, NOME TEXT, CPF TEXT)";
		statement.executeUpdate(sql);
		System.out.println("Tabela criada");
		
		disconnect();
	}
	
	public static void insert(Usuario usuario) throws SQLException {
		
		connect();
				
		String sql = " INSERT INTO USUARIO (IDUSUARIO, NOME) VALUES(?,?)";
		PreparedStatement prepState = conn.prepareStatement(sql);
		prepState.setLong(1, usuario.getIdUsuario());
		prepState.setString(2, usuario.getNome());
		
		prepState.executeUpdate();
		
		System.out.println("Usuario inserido");
		prepState.close();
		disconnect();
	}

	private static Statement createStatement() throws SQLException {
		return conn.createStatement();
	}
	
	public static List<Usuario> findAll() throws SQLException {
		
		connect();
		
		List<Usuario> lista = new ArrayList<>();
		
		String query = "SELECT IDUSUARIO, NOME FROM USUARIO ";
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		
		
		while (rs.next()) {
		    Usuario usuario = new Usuario(rs.getLong("IDUSUARIO"), rs.getString("NOME"));
		    lista.add(usuario);
		}
		
		
		
		
		rs.close();
		pstmt.close();
		disconnect();
		
		return lista;
		
	}
	
	public static void dropTable(String nomeTabela) throws SQLException {
		connect();
		ResultSet set = null;
		String query = " DROP TABLE " + nomeTabela;
		set = createStatement().executeQuery(query);
		System.out.println("Tabela " + nomeTabela + " deletada do banco!");
		
		set.close();
		disconnect();
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		List<Usuario> lista = findAll();
		for (Usuario usuario : lista) {
			System.out.println("Nome: " + usuario.getNome() + " id: " + usuario.getIdUsuario());
		}
	
		
	}
	

}
