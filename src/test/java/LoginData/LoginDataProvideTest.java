package LoginData;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Data.GenrateData;
import DemoXunit.Login;

public class LoginDataProvideTest {

	@Test(dataProvider = "getUsers", dataProviderClass = GenrateData.class)
	public void testLogin(String name1, String pwd1, String expect1) {
		Login login = new Login();
		String ac = login.userLogin(name1, pwd1);
		Reporter.log("�û���½�ɹ�");
		Assert.assertEquals(ac, expect1);
	}

}
