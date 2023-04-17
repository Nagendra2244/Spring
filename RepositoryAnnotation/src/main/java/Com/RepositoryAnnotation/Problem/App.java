package Com.RepositoryAnnotation.Problem;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
       context.scan("Com.RepositoryAnnotation.Problem");
        context.refresh();
        UserRepository userRepository=context.getBean(UserRepository.class);
        List<String>users=userRepository.getUsers();
        for(String user:users) {
        	System.out.println("User:"+user);
        	context.close();
        }
    }
}
