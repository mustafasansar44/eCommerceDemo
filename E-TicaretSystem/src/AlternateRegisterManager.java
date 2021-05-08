
public class AlternateRegisterManager implements AlternateRegister{

	RegisterCheckService registerCheck;
	DatabaseService database;
	
	public AlternateRegisterManager(RegisterCheckService registerCheck, DatabaseService database) {
		this.registerCheck = registerCheck;
		this.database = database;
	}
	
	
	@Override
	public void addGoogle(User user) {
		if(this.registerCheck.checkRegister(user, this.database.getUsers())) {
			this.database.addUsers(user);
			System.out.println(user.getFirstName() + " " + user.getLastName() + " Adlý kullanýcý GOOGLE ile kaydedildi.");	
			System.out.println(user.getEmail() + " posta kutunuza aktivasyon bilgileri gönderildi.");
		}
	}

}
