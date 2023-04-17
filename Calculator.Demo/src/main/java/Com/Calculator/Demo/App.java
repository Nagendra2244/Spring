package Com.Calculator.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       CalculatorService calculatorService =(CalculatorService)context.getBean(CalculatorService.class);
		        int a = 25, b = 10;
		        System.out.println("Addition result:" + calculatorService.add(a, b));
		        System.out.println("Subtraction result:" + calculatorService.subtract(a, b));
		        System.out.println("Multiplication result:" + calculatorService.multiply(a, b));
		        System.out.println("Division result:" + calculatorService.divide(a, b));
		    }


}
