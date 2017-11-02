package br.com.lramos.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.lramos.agenda.bean.Usuario;
import br.com.lramos.agenda.connection.ConnectionFactory;

public class UsuarioDAO {

	private Connection connection;

	public void insert (Usuario usuario) {
		String sql = "INSERT INTO Usuario(nome, email) VALUES (?, ?)";
		connection = ConnectionFactory.createConnection();

		try {
			
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getEmail());

			statement.execute();
			
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void update (Usuario usuario) {
		String sql = "UPDATE Usuario SET nome = ?, email = ? WHERE id = ?";
		connection = ConnectionFactory.createConnection();

		try {
			
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getEmail());
			statement.setInt(3, usuario.getId());

			statement.execute();
			
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void delete (Usuario usuario) {
		String sql = "DELETE Usuario WHERE id = ?";
		connection = ConnectionFactory.createConnection();

		try {
			
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setInt(1, usuario.getId());

			statement.execute();
			
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public Usuario select (String nome) {
		String sql = "SELECT * FROM Usuario WHERE nome = ?";
		connection = ConnectionFactory.createConnection();
		Usuario usuario = new Usuario();

		try {
			
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, nome);

			ResultSet result = statement.executeQuery();
			
			while (result.next()) {
				usuario.setId(result.getInt("id"));
				usuario.setNome(result.getString("nome"));
				usuario.setEmail(result.getString("email"));
			}
			
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return usuario;
	}

}
