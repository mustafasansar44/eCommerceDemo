import java.util.List;

public class UserManager implements UserService{



	RegisterCheckService registerCheck;
	DatabaseService database;
	
	public UserManager(RegisterCheckService registerCheck, DatabaseService database) {
		this.registerCheck = registerCheck;
		this.database = database;
	}
	
	@Override
	public void addUser(User user) {
		if(this.registerCheck.checkRegister(user, this.database.getUsers())) {
			this.database.addUsers(user);
			System.out.println(user.getFirstName() + " " + user.getLastName() + " Adlý kullanýcý kaydedildi.");	
			System.out.println(user.getEmail() + " posta kutunuza aktivasyon bilgileri gönderildi.");

		}

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		return null;
	}




	

}
