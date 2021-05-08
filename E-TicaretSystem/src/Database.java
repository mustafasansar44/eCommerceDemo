import java.util.ArrayList;

public class Database implements DatabaseService {
	public ArrayList<User> users = new ArrayList<User>();	// DATABASE

	@Override
	public void addUsers(User user) {
		users.add(user);
		
	}
	@Override
	public ArrayList<User> getUsers() {
		return users;
	}


	
	
}
