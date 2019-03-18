package co.edu.uniajc.cajero;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * 
 * @author Steven Ordoñez
 *
 */

@Configuration
public class DataConfig {

	@Bean(name="dbcajero")
	@ConfigurationProperties(prefix="spring.dbcajero")
	@Primary
	public DataSource createProfileDataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="jdbcCajero")
	@Autowired
	public JdbcTemplate createJdbcCajero(@Qualifier("dbcajero")DataSource cajeroDS) {
		return new JdbcTemplate(cajeroDS);
	}
	
	public DataSource conexion() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/CAJERO?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driverManagerDataSource;
	}
	
}
