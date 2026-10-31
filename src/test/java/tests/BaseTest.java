package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
    protected static final String BASE_URL = "https://www.saucedemo.com/";
    protected static final String INVENTORY_URL = "https://www.saucedemo.com/inventory.html";

    protected WebDriver driver;
    protected static By pageTitle = By.xpath("//span[@data-test='title']");

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();


    }
}
