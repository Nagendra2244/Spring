package Com.Qualifiermethod.Problem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cat")
public class Cat implements Animal{

	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Meow Meow");
	}

}
