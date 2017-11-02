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
    	
    	usuario.setId(2);
    	usuario.setEmail("janaina@gmail.com");
    	usuario.setNome("Janaina Ramos");
    	
    	UsuarioDAO usuarioDAO = new UsuarioDAO();
    	
    	usuario.setEmail("janaina1234@gmail.com");
    	
    	usuarioDAO.update(usuario);
    }
}
