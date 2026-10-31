package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AuthorisationTests extends BaseTest {
    private static final By userNameInput = By.id("user-name");
    private static final By passwordInput = By.id("password");
    private static final By loginButton = By.id("login-button");
    private static final By errorButton = By.cssSelector(".error-button");

    private final String validUserName = "standard_user";
    private final String validPassword = "secret_sauce";

    @BeforeMethod
    public void getSauceDemo(){
        driver.get(BASE_URL);
    }

    @Test
    public void authUserWithValidData() {

        driver.findElement(userNameInput).sendKeys(validUserName);
        driver.findElement(passwordInput).sendKeys(validPassword);
        driver.findElement(loginButton).click();

        String inventoryPageTitle = driver.findElement(pageTitle).getText();
        assertEquals(inventoryPageTitle, "Products", "Страница Products не открыта");
    }

    @Test
    public void authUserWithInvalidData(){
        driver.findElement(userNameInput).sendKeys("wrong_name");
        driver.findElement(passwordInput).sendKeys("wrong_password");
        driver.findElement(loginButton).click();

        boolean isDisplayedErrorButton = driver.findElement(errorButton).isDisplayed();

        assertTrue(isDisplayedErrorButton);
    }


}
