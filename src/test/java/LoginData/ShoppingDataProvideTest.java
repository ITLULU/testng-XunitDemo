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
        Reporter.log("�û���¼�ɹ���������Ʒ"+shopping.getPro(proId));
        Assert.assertEquals(price,expect);
    }

}
