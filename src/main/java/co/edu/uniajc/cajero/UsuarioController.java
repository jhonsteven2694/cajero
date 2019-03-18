package co.edu.uniajc.cajero;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniajc.cajero.dao.UsuarioDao;
import co.edu.uniajc.cajero.model.Usuario;

/**
 * 
 * @author Steven Ordoñez
 *
 */

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioDao usuarioDao;
	
	@RequestMapping(value="/mostrar-usuarios")
	public List<Usuario> showUsers() {
		DataConfig data = new DataConfig();
		DataSource dataSource = data.conexion();	
		
		return usuarioDao.showUsersDao(dataSource);
	}
}
