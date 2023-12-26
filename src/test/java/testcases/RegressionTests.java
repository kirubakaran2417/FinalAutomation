package testcases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.Loginpage;

public class RegressionTests extends BaseTest {

    @Test
    public void testSignin(){
        Loginpage loginpage = gotoLoginpage();
        InventoryPage inventoryPage = loginpage
                .setUsername("standard_user")
                .setPassword("secret_sauce")
                .clickLogin();
    }
    @Test
    public void testInventory(){
        
    }
}
