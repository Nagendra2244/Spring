package Com.ServiceAnnotation.Problem;

import org.springframework.stereotype.Service;

@Service

public class EmailService implements MessageService {

	public String getMessage() {
		// TODO Auto-generated method stub
		
	return "This is an email message";
		}

}
