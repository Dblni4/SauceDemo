package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Inventory extends BaseTest {
    private static final By addToCart = By.id("[id ='add-to-cart-sauce-labs-bike-light']");

    @BeforeMethod
    public void getSauceDemo() {
        driver.get(INVENTORY_URL);
    }

    @Test
    public void addItemToCart() {

        driver.findElement(addToCart).click();

    }

}
