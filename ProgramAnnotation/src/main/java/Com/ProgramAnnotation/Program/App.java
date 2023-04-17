package Com.ProgramAnnotation.Program;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {
    public static void main(String[] args) {
    	
    	
        // create a new Spring application context using the AppConfig class as the configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.scan("Com.ProgramAnnotation.DAO");
        StudentDAO student = (StudentDAO) context.getBean(StudentDAO.class);
        student.create("Nagendra", 22);
        student.create("Suraj", 22);
        student.create("Charan", 20);
        student.create("Venkat", 19);
        
        

        System.out.println("---------Searching record by ID--------");
        Student student1 = student.getStudentById(1);
        System.out.println("ID: " + student1.getID());
        System.out.println("Name: " + student1.getNAME());
        System.out.println("Age: " + student1.getAGE());

        System.out.println("---------Deleting record--------");
        student.deleteStudentByID(3);
        System.out.println("Record with ID 3 deleted successfully!");

        System.out.println("---------Updating record--------");
        Student studentToUpdate = new Student();
        studentToUpdate.setID(2);
        studentToUpdate.setAGE(23);
       System.out.println("Record updated successfully!");
    }
}
