package LoginParam;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DemoXunit.Login;

public class LoginParamsTest {
	 Login login = new Login();

	@Test()
	@Parameters({"username","pwd"})
	public void TestLoginParam(String username,String pwd) {
		login.userLogin(username, pwd);
	}
}
