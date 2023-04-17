package Com.ServiceAnnotation.Problem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("Com.ServiceAnnotation.Problem");
        context.refresh();
        
        MessageService message=context.getBean(MessageService.class);
        System.out.println(message.getMessage());
        context.close();
    }
}