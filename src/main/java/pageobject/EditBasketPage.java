package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditBasketPage {

    WebDriver driver;

    By shoppingCartLocator = By.id("sc-active-cart");
    By cartFormLocator = By.id("activeCartViewForm");
    By bookInCartTitleLocator = By.xpath("//li/span/a[span[@class='a-size-medium sc-product-title a-text-bold']]");
    By bookInCartTypeLocator = By.xpath("//li/span[span[@class='a-size-small a-color-secondary sc-product-binding']]");
    By bookInCartPriceLocator = By.xpath("//span[@class = 'a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold']");
    By bookInCartQuantityLocator = By.id("nav-cart-count");
    By amountCartLocator = By.id("sc-subtotal-amount-activecart");
    By totalAmountLocator = By.xpath("//span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-price-sign']");



    public EditBasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public void i_should_be_in_Edit_Shopping_Basket() throws Throwable {
        WebElement shoppingCart = driver.findElement(shoppingCartLocator);
        shoppingCart.isDisplayed();
    }

    public void the_title_says(String expectedBookTitle) throws Throwable {
        String actualBookTitle = driver.findElement(cartFormLocator).findElement(bookInCartTitleLocator).getText();
        Assert.assertTrue(actualBookTitle.startsWith(expectedBookTitle));

    }

    public void it_is_a_Paperback_book(String expectedBookType) throws Throwable {
        String actualType = driver.findElement(cartFormLocator).findElement(bookInCartTypeLocator).getText();
        Assert.assertEquals("The book type if different than expected", expectedBookType, actualType);

    }

    public void it_is_with_price_of(String expectedBookPrice) throws Throwable {
        String actualBookPrice = driver.findElement(cartFormLocator).findElement(bookInCartPriceLocator).getText();
        Assert.assertEquals("The book price is different than expected", expectedBookPrice, actualBookPrice);

    }

    public void it_s_quantity_is_one(String expectedQuantity) throws Throwable {
        String actualQuantity = driver.findElement(bookInCartQuantityLocator).getText();
        Assert.assertEquals("The item quantity is different than expected", expectedQuantity, actualQuantity);

    }

    public void the_total_price_is(String expectedTotalPrice) throws Throwable {
        String actualSubtotalAmount = driver.findElement(amountCartLocator).findElement(totalAmountLocator).getText();
        Assert.assertEquals("The expected total price is different than expected", expectedTotalPrice, actualSubtotalAmount);
    }
}
