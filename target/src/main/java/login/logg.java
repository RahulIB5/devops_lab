package login;
import java.util.ResourceBundle;

public class logg {
	public static String validate(String username,String password) {
		if("admin".equals(username)&&
				"admin123".equals(password)) {
			return "Login success";
		}
		return "Login Failed";
	}
}
