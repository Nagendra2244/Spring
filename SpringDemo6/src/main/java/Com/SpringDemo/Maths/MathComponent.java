package Com.SpringDemo.Maths;
import org.springframework.stereotype.Component;

@Component("mc")
public class MathComponent {
	public int add(int x,int y) {
		return x+y;
	}
}
