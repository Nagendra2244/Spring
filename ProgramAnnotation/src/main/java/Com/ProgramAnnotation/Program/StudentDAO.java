package Com.ProgramAnnotation.Program;

import javax.sql.DataSource;



public interface StudentDAO {
	public void setDataSource(DataSource ds);
	 public void create(String NAME,Integer AGE);
	 public Student getStudentById(Integer ID);
	 public int deleteStudentByID(Integer ID);
	 public void updateStudent(Integer ID,Integer AGE);
	 

}