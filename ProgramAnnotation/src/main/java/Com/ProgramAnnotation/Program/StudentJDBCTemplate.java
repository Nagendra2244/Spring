package Com.ProgramAnnotation.Program;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mysql.cj.xdevapi.Statement;


@Component
public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

   @Autowired
    public void setDataSource(DataSource ds) {
        this.dataSource=ds;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
    }

   public void create(String NAME, Integer AGE) {
	    String SQL = "INSERT INTO students(NAME, AGE) VALUES (?, ?)";
	    jdbcTemplateObject.update(SQL,NAME,AGE);
	    System.out.println("Created Record Name=" + NAME + ", Age=" + AGE);
	}

public Student getStudentById(Integer ID) {
	// TODO Auto-generated method stub
	String sql = "SELECT * FROM students WHERE ID = ?";
    Student student=jdbcTemplateObject.queryForObject(sql, new Object[]{ID}, new BeanPropertyRowMapper<Student>(Student.class));
	return student;
}
public int deleteStudentByID(Integer ID) {
	// TODO Auto-generated method stub
	 String sql = "DELETE FROM students WHERE ID = ?";
     jdbcTemplateObject.update(sql, ID);
     System.out.println("Deleted Record with ID = " + ID);
	return ID;
}

public void updateStudent(Integer ID, Integer AGE) {
	// TODO Auto-generated method stub
	String sql = "UPDATE students SET  AGE = ? WHERE ID = ?";
    jdbcTemplateObject.update(sql,AGE,ID );
    System.out.println("Updated Record with ID = " + ID);
}


  
   
}
