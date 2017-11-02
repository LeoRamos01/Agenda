package br.com.lramos.agenda;

import br.com.lramos.agenda.bean.Usuario;
import br.com.lramos.agenda.dao.UsuarioDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Usuario usuario = new Usuario();
    	
    	usuario.setEmail("drleo111@gmail.com");
    	usuario.setNome("Leonardo Ramos");
    	
    	UsuarioDAO usuarioDAO = new UsuarioDAO();
    	
    	usuarioDAO.insert(usuario);
    }
}
