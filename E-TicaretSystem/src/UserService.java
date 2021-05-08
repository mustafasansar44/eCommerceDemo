import java.util.List;

public interface UserService {
	void addUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	List<User> getAll();
}
