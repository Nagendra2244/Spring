package Com.ValueAnnotation.Problem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("Com.ValueAnnotation.Problem");
        context.refresh();
        
        MyApp app=context.getBean(MyApp.class);
        app.displayInformation();
        context.close();
   }
}  
