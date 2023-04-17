package Com.SpringDemo.Maths;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
    public static void main( String[] args ) {
 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
    context.scan("Com.SpringDemo.Maths");
    context.refresh();
    MathComponent ms=(MathComponent)context.getBean("mc");
    int result=ms.add(1,2);
    System.out.println("Addition of 1 and 2 =" +result);
    context.close();
       
  }
}
