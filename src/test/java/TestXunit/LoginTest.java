package TestXunit;

import org.testng.annotations.Test;

import DemoXunit.Login;

/**
 * 
 * @author Administrator
 *
 */
public class LoginTest {

	
	@Test
	public void testUserLogin1() {
		String name1 = "";
		String pwd1 = "";
		Login login = new Login();
		String ac = login.userLogin(name1, pwd1);
	}

	@Test
	public void testUserLogin2() {
		String name1 = "zhangsan";
		String pwd1 = "123456";
		Login login = new Login();
		String ac = login.userLogin(name1, pwd1);
	}

	@Test
	public void testUserLogin3() {
		String name1 = "lisi";
		String pwd1 = "";
		Login login = new Login();
		String ac = login.userLogin(name1, pwd1);
	}

	@Test
	public void testUserLogin4() {
		String name1 = "admin";
		String pwd1 = "123456";
		Login login = new Login();
		String ac = login.userLogin(name1, pwd1);
	}

}
