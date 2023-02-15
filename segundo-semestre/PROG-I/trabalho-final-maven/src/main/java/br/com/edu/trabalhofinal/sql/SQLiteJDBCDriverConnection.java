package br.com.edu.trabalhofinal.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteJDBCDriverConnection {
	
	private static void connect(String query) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {
            System.out.println("Conexão realizada !!!!");

            Statement statement = connection.createStatement();
            
            

            
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	
	
	public Object consultar() {
		
		Object teste = new Object();
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

    public static void main(String[] args) {
        connect();
    }

}
