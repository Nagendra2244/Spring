package Com.SpringFrameworkTemplate.Project;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAo {
 public void setDataSource(DataSource ds);
 public void create(String NAME,Integer AGE);
 public List<Student> listStudents();
 public Student getStudentByID(int ID);
 public void updateStudent(Student student);
 public int deleteStudentByID(int ID);
}
