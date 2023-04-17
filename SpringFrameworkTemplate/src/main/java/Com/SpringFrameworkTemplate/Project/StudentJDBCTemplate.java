package Com.SpringFrameworkTemplate.Project;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAo {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource ds) {
        this.dataSource=ds;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
    }

    public void create(String NAME, Integer AGE) {
        String SQL="insert into students(NAME,AGE)value(?,?)";
        jdbcTemplateObject.update(SQL, NAME, AGE);
        System.out.println("create Record Name =" +NAME+ "Age="+AGE);
    }

    public List<Student> listStudents() {
        String SQL="select * from students";
        List<Student> students = jdbcTemplateObject.query(SQL, new BeanPropertyRowMapper<Student>(Student.class));
        return students;
    }

    public Student getStudentByID(int ID) {
    	String SQL = "SELECT * FROM students WHERE ID = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL, new Object[]{ID}, new BeanPropertyRowMapper<>(Student.class));
        return student;
    }

    public void updateStudent(Student student) {
        String SQL = "UPDATE students SET NAME = ?, AGE = ? WHERE ID = ?";
        jdbcTemplateObject.update(SQL, student.getNAME(), student.getAGE(), student.getID());
        System.out.println("Updated Record with ID = " + student.getID());
    }

    public int deleteStudentByID(int ID) {
        String SQL = "DELETE FROM students WHERE ID = ?";
        jdbcTemplateObject.update(SQL, ID);
        System.out.println("Deleted Record with ID = " + ID);
		return ID;
    }

}
