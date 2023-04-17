package Com.Qualifiermethod.Problem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
     context.scan("Com.Qualifiermethod.Problem");
     context.refresh();
     
     Zoo zoo=context.getBean(Zoo.class);
     zoo.play();
     context.close();
     
    }
}
