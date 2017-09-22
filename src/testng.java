import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {

	@BeforeMethod
	public void login() {
		Reporter.log("Open ActiTime(Login)", true);
	}
	
	@Test
	public void EnterValidDetails() {
		System.out.println("Enetr user name");
		System.out.println("Ener password");
		System.out.println("Click login");
	}

	@AfterMethod
	public void loginout() {
		Reporter.log("(Logout Actitime)Login out", true);
	}

}
