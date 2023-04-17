package Com.OnlineProduct.Program;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan (basePackages = "Com.OnlineProduct.Program")
public class AppConfig {
	@Bean
	public DataSource dataSource() {
	
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/product");
	dataSource.setUsername("root");
	dataSource.setPassword("");
	return dataSource;
	}
@Bean
public ProductJDBCTemplate productJDBCTemplate() {
  return new ProductJDBCTemplate();
   }
}
