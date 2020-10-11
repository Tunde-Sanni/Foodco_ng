package ProjectObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    // create a WebDriver Object
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

     //locate the element username
    private By username = By.xpath("//*[@id=\"username\"]");

    public void enterUsername(String uName)
    {
        //find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }

   public void enterUserPassword(String pwd)
   {
       WebElement passwordField = driver.findElement(By.id("password"));
       passwordField.sendKeys(pwd);
   }
     public DashboardPage clickLoginButton()
     {
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button")).click();
        return new DashboardPage(driver);
     }
}
