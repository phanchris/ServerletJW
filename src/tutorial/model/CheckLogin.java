package tutorial.model;

public class CheckLogin {
	public boolean Check(String username, String userpassword) {
		if (username.equals("chrisphan") && userpassword.equals("123456")) {

			return true;
		} else {
			return false;
		}
	}

}
