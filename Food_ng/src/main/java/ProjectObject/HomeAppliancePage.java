package ProjectObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeAppliancePage {
    //Create a WebDriver Object
    private WebDriver driver;

    public HomeAppliancePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locate the clipper
    private By clipper = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/div/div[2]/a/h3");
     public String getClipperText(){
         return driver.findElement(clipper).getText();
     }

    //locate the Daewoo Toaster

    private By toaster = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/div/div[2]/a/h3");
    public String getToasterText(){
        return driver.findElement(toaster).getText();
    }

    //locate the element Battery
    private By battery = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/div/div[2]/a/h3");
    public String getBatteryText(){
        return driver.findElement(battery).getText();}

        //locate the element Logout

    public LogoutPage clickButton() {
        driver.findElement(By.xpath("//*[@id=\"nav-menu-item-6558\"]/a")).click();
        return new LogoutPage(driver);
    }
}