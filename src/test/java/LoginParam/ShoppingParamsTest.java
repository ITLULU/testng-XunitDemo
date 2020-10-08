package LoginParam;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DemoXunit.Shopping;

public class ShoppingParamsTest {
	  
	  Shopping shopping = new Shopping();
	   LoginParamsTest login=new LoginParamsTest();

	    @Test(dependsOnMethods = "LoginParam.LoginParamsTest.TestLoginParam")
	    @Parameters({"proId"})
	    public void testGetPrice(int proId){
	        int price = shopping.getPrice(proId);
	    }

	    @Test(dependsOnMethods = "LoginParam.LoginParamsTest.TestLoginParam")
	    @Parameters({"proId","count"})
	    public void testGetProduct(int proId,int count){
	      int num=shopping.buy(proId, count);
	    }

}
