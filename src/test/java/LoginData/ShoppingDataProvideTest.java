package LoginData;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Data.GenrateData;
import DemoXunit.Shopping;
/**
 * 
 * @author Administrator
 *
 */
public class ShoppingDataProvideTest {


    Shopping shopping = new Shopping();

    @Test(dataProvider = "getProPrice",dataProviderClass = GenrateData.class, dependsOnMethods = "LoginData.LoginDataProvideTest.testLogin")
    public void testGetPrice(int proId, int expect){
        int price = shopping.getPrice(proId);
        Reporter.log("用户登录成功，购买物品"+shopping.getPro(proId));
        Assert.assertEquals(price,expect);
    }

}
