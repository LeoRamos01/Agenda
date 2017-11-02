package br.com.lramos.agenda.business;

import br.com.lramos.agenda.bean.Usuario;
import br.com.lramos.agenda.dao.UsuarioDAO;

public class UsuarioBusiness {
	
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public void inserir (Usuario usuario) {
		usuarioDAO.insert(usuario);
	}
	
	public void atualizar (Usuario usuario) {
		usuarioDAO.update(usuario);
	}
	
	public void deletar (Usuario usuario) {
		usuarioDAO.delete(usuario);
	}
	
	public void buscar (Usuario usuario) {
		String nome = usuario.getNome();
		usuarioDAO.select(nome);
	}
}
