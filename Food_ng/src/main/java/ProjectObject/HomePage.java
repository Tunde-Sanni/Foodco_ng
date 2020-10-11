package ProjectObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //Create a WebDriver object
    private WebDriver driver;



    public HomePage(WebDriver driver)
    {
       this.driver = driver;
    }

    //find the location
    private By location= By.xpath("/html/body/div[6]/div[2]/div[1]/form/label[2]");
    public boolean confirmLagos(){
        return driver.findElement(location).isDisplayed();
    }
    public void clickLagos(){
        driver.findElement(location).click();
    }

    public LoginPage clickMyAccount()
    {
        driver.findElement(By.xpath("//*[@id=\"nav-menu-item-20267\"]/a")).click();
        return new LoginPage(driver);
    }


}
