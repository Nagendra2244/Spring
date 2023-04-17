package Com.SpringDemo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args )
    {

    	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

         Employee1 obj = (Employee1) context.getBean("obj");
         obj.display();
    	 Question obj1=(Question)context.getBean("question");
    	 obj1.display();
    }
}
