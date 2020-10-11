package setup;


import ProjectObject.HomePage;
import ProjectObject.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetupTest {

    //create a WebDriver object
    private WebDriver driver;
    //Create LoginPage Object
    protected HomePage homePage;

    @BeforeTest
    public void setUp() {
        //set up the chrome Browser
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Instantiate the Web driver object
        driver = new ChromeDriver();

        //Maximize Window size
        driver.manage().window().maximize();

        //launch the application
        driver.get("https://foodco.ng/");


        //Instantiate the login page after launching the Browser
        homePage= new HomePage(driver);

    }

    @AfterTest

    public void closeBrowser(){
        driver.quit();
    }
}