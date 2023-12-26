package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.Loginpage;

import java.time.Duration;

public class BaseTest {
    private static final String BASE_URL = "https://www.saucedemo.com/";
    public static WebDriver driver;

    public static final String sauce_demo_title="Swag Labs";
    @BeforeTest
    public static void setupDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
        driver.manage().window().maximize();
    }
    @AfterTest
    public static void tearDown(){
        driver.quit();
    }

    public Loginpage gotoLoginpage(){
        driver.get(BASE_URL);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs(sauce_demo_title));
        Assert.assertEquals(driver.getTitle(),sauce_demo_title);//assert
        return PageFactory.initElements(driver, Loginpage.class);
    }
}
