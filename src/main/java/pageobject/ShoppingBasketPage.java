package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingBasketPage {

    WebDriver driver;

    By notificationAreaLocator = By.id("huc-v2-order-row-container");
    By notificationMessageLocator = By.xpath("//h1[contains(text(), 'Basket')]");
    By itemQuantityLocator = By.id("nav-cart-count");
    By editBasketButtonLocator = By.id("hlb-view-cart-announce");

    public ShoppingBasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public void a_notification_is_shown() throws Throwable {
        WebElement notification = driver.findElement(notificationAreaLocator);
        notification.isDisplayed();
    }

    public void there_should_be_a_text(String expectedNotificationMessage) throws Throwable {
        String actualNotificationMessage = driver.findElement(notificationMessageLocator).getText();
        Assert.assertEquals("Notification message is different than expected", expectedNotificationMessage, actualNotificationMessage);
    }

    public void the_item_is_the_basket_should_be_one(String expectedItemQuantity) throws Throwable {
        String actualQuantity = driver.findElement(itemQuantityLocator).getText();
        Assert.assertEquals("The quantity of the item is different than expected", expectedItemQuantity, actualQuantity);
    }

    public void i_navigate_to_button_to_edit_the_basket() throws Throwable {
        driver.findElement(editBasketButtonLocator).click();
    }
}
