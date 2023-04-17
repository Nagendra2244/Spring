package Com.SpringFrameworkTemplate.Project;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

       
        System.out.println("---------DATABASE CREATION-----");
        studentJDBCTemplate.create("Nagendra", 25);
        studentJDBCTemplate.create("Swamy", 23);
        studentJDBCTemplate.create("Dinesh", 25);

        System.out.println("---------Listing multiple Records--------");
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student student : students) {
            System.out.println("ID:" + student.getID());
            System.out.println("Name:" + student.getNAME());
            System.out.println("Age:" + student.getAGE());
        }

        System.out.println("---------Searching record by ID--------");
        Student student = studentJDBCTemplate.getStudentByID(1);
        System.out.println("ID:" + student.getID());
        System.out.println("Name:" + student.getNAME());
        System.out.println("Age:" + student.getAGE());

        
        System.out.println("---------Updating record--------");
        student.setNAME("Rajesh");
        student.setAGE(26);
        studentJDBCTemplate.updateStudent(student);
        System.out.println("Record updated successfully!");
        System.out.println("Updated details:");
        System.out.println("ID:" + student.getID());
        System.out.println("Name:" + student.getNAME());
        System.out.println("Age:" + student.getAGE());

        
        System.out.println("---------Deleting record--------");
        int deletedRecords = studentJDBCTemplate.deleteStudentByID(3);
        if(deletedRecords > 0) {
            System.out.println("Record with ID 3 deleted successfully!");
        } else {
            System.out.println("Record with ID 3 not found or could not be deleted.");
        }
       
    }
}
