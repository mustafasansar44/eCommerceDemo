import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class RegisterCheckManager implements RegisterCheckService{

	@Override
	public boolean checkRegister(User user, ArrayList<User> users) {
		if(user.getPassword().length() < 6) {
			System.out.println("Parolanýz en az 6 karakterden oluþmalýdýr.");
			return false;
		}else {
			String regex = "^(.+)@(.+)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(user.getEmail().toLowerCase());
			
			if(matcher.matches()) {
				if(user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
					for(User checkMail : users) {
						if(checkMail.getEmail() == user.getEmail()) {
							System.out.println("Bu email kullanýlýyor.");
							return false;
						}
					}
					return true;
				}else {
					System.out.println("Ad veya soyadýnýz minimum 2 karakterden oluþabilir.");
				}
				
			}else {
				System.out.println("Lütfen email adresiniz doðru giriniz. Girdiðiniz email: " + user.getEmail());
				return false;
			}
			
		}
		return false;
	}

	@Override
	public boolean checkRegister(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
