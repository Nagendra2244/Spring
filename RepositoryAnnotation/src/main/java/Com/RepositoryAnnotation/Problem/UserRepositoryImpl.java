package Com.RepositoryAnnotation.Problem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{

	public List<String> getUsers() {
		// TODO Auto-generated method stub
		List<String> users=new ArrayList<String>();
		users.add("Nagendra");
		users.add("Swamy");
		users.add("Sohail");
		users.add("Vinay");
		users.add("Pavan");
		users.add("Ravi");
		users.add("Jyothi");
		users.add("Ranjitha");
		users.add("Pawankalyan");
		users.add("Sourav");
		return users;
	}
	

}
