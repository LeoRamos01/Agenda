package br.com.lramos.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.lramos.agenda.bean.Usuario;
import br.com.lramos.agenda.connection.ConnectionFactory;

public class UsuarioDAO {

	private Connection connection;

	public void insert(Usuario usuario) {
		String queryInserir = "INSERT INTO Usuario(nome, email) VALUES (?, ?)";
		connection = ConnectionFactory.createConnection();

		try {
			
			PreparedStatement statement = connection.prepareStatement(queryInserir);

			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getEmail());

			statement.execute();
			
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
