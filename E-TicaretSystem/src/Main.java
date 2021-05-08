
public class Main {

	public static void main(String[] args) {

		
		User user1 = new User("Mustafa", "Sansar", "deneme1@gmail.com", "123456");
		User user2 = new User("Engin", "Demiroð", "deneme2@yahoo.com", "123456");
		User user3 = new User("Kemal", "Akalý", "deneme2@yahoo.com", "123456");
		User user4 = new User("Kemal", "Akalý", "deneme2@yahoo.com", "1234");
		User user5 = new User("K", "Akalý", "deneme223@yahoo.com", "123456");
		User user6 = new User("Kemal", "A", "deneme232@yahoo.com", "123456");
		User user7 = new User("Mustafa", "Sansar", "deneme2342142@yahoo.com", "123456");
		User user8 = new User("Mustafa", "Sansar", "deneme23421@yahoo.com", "123456");

		
		UserService userService = new UserManager(new RegisterCheckManager(), new Database());
		AlternateRegister alternateRegister = new AlternateRegisterManager(new RegisterCheckManager(), new Database());
		
		User[] normalUser = {user1, user2, user3, user4, user5, user6};
		User[] alternateUser = {user7, user8}; 
		
		for(User user : normalUser) {
			userService.addUser(user);
		}
		
		for(User user : alternateUser) {
			alternateRegister.addGoogle(user);
		}



	}

}
