package Com.ProgramAnnotation.Program;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan (basePackages = "Com.ProgramAnnotation.Program")
public class AppConfig {
	@Bean
	public DataSource dataSource() {
	
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/student");
	dataSource.setUsername("root");
	dataSource.setPassword("");
	return dataSource;
	}
@Bean
public StudentJDBCTemplate studentJDBCTemplate() {
  return new StudentJDBCTemplate();
   }
}

