import java.util.ArrayList;

public interface RegisterCheckService {
	boolean checkRegister(User user);

	boolean checkRegister(User user, ArrayList<User> users);
}
