package br.com.lramos.agenda.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private final static String url = "jdbc:mysql://localhost:3306/Agenda"; //Nome da base de dados
	private final static String user = "root"; //nome do usuário do MySQL
	private final static String password = "4142135"; //senha do MySQL
	
	public static Connection createConnection() {
		
		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conexao; 
	}
}
