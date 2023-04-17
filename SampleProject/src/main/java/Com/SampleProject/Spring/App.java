package Com.SampleProject.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	 
    		 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
    		    context.scan("Com.SampleProject.Spring");
    		    context.refresh();
    		    
    		    
    		  }
    }
