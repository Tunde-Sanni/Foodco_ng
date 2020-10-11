package Login;

import ProjectObject.*;
import org.testng.annotations.Test;
import setup.SetupTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends SetupTest {
LoginPage loginPage;
DashboardPage dashboardPage;
HouseholdPage householdPage;
HomeAppliancePage homeAppliancePage;
LogoutPage logoutPage;

@Test(priority = 1)
    public void testHome(){
    assertTrue(homePage.confirmLagos());
    homePage.clickLagos();
    loginPage =homePage.clickMyAccount();
}
@Test(priority = 2)
    public void testLogin(){
    loginPage.enterUsername("shile");
    loginPage.enterUserPassword("SEXXY007!");
    dashboardPage= loginPage.clickLoginButton();
}
@Test(priority = 3)
    public void testHousehold(){
    householdPage= dashboardPage.clickButton();
}
@Test(priority =4)
    public void testHomeAppliances(){
    homeAppliancePage= householdPage.clickButton();
}
@Test(priority = 5)
    public void testHomeAppl(){
    assertEquals(homeAppliancePage.getClipperText(),"Clipper Wahl Homepro 100 Series","Item is not present");
    assertEquals(homeAppliancePage.getToasterText(),"Deawoo Oven Toaster 18l Dot-1656b","Item is not present");
    assertEquals(homeAppliancePage.getBatteryText(),"Daewoo Panini Grill Dhg-2674 ","Item is not present");
    logoutPage= homeAppliancePage.clickButton();
}
@Test(priority = 6)
    public void testLogout() throws InterruptedException{
    loginPage= logoutPage.clickLogout();
}

}

