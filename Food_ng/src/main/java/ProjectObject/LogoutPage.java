package ProjectObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    //Create a WebDriver object
    private WebDriver driver;

    public LogoutPage(WebDriver driver)
    {
        this.driver = driver;

    }

    //close the browser
    private By logout = By.xpath("//*[@id=\"content\"]/article/div/div/div[1]/a");

    public LoginPage clickLogout() throws InterruptedException
    {
        //wait for 5 seconds to execute the plan
        Thread.sleep(5000);
        driver.findElement(logout).click();
        return new LoginPage(driver);
    }


}
