package ProjectObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    //Create a WebDriver Object
    private WebDriver driver;

    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }
    //locate the element

    public HouseholdPage clickButton()
    {
        driver.findElement(By.xpath("//*[@id=\"nav-menu-item-3339\"]/a")).click();
        return new HouseholdPage(driver);
    }




}
