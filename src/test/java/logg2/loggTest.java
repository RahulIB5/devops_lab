package logg2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loggTest {
	
	@Test
	public void testValidLogin() {
		Assert.assertEquals(
			login.logg.validate("admin","admin123"),
			"Login SUccessful"
		);
	}
	
	@Test
	public void testWrongPassword() {
		Assert.assertEquals(
			login.logg.validate("admin","wrongpass"),
			"Login Failed"
		);
	}
	
	@Test
	public void testWrongusername() {
		Assert.assertEquals(
			login.logg.validate("wrnguser","wrongpass"),
			"Login Failed"
		);
	}
}
