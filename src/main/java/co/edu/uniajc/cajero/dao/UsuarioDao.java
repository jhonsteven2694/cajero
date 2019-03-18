package co.edu.uniajc.cajero.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import co.edu.uniajc.cajero.DataConfig;
import co.edu.uniajc.cajero.model.Usuario;

/**
 * 
 * @author Steven Ordoñez
 *
 */

@Repository
public class UsuarioDao {

	@Qualifier("jdbcCajero")
	@Autowired 
	JdbcTemplate jdbcTemplate;
	DataConfig dataConfig;
	
	public List<Usuario> showUsersDao(DataSource datasource) {
		
		String sql = "select * from usuarios";
		
		List<Usuario> users = new ArrayList<>();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
		jdbcTemplate.query(sql, new ResultSetExtractor<Object>() {
			public List<Usuario> extractData(ResultSet rs) throws SQLException{
				while (rs.next()) {
					Usuario user = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9));
					users.add(user);
				}
				return users;
			}
		});
		
		return users;
	}
}
