package ProjectObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HouseholdPage {
    // Create a WebDriver object

    private WebDriver driver;

    public HouseholdPage(WebDriver driver) {
        this.driver = driver;
    }

    //locate the element
    public HomeAppliancePage clickButton() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/a/span/span[2]/span")).click();
        return new HomeAppliancePage(driver);
    }



}
