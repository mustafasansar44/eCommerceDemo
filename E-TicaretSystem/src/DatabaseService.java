import java.util.ArrayList;

public interface DatabaseService {
	void addUsers(User user);
	ArrayList<User> getUsers();
}
