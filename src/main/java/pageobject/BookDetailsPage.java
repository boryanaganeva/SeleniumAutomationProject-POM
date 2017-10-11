package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookDetailsPage {
    WebDriver driver;

    By bookTitleLocator = By.id("productTitle");
    By bookTypeLocator = By.xpath("//a//span[contains(text(),'Paperback')]");
    By bookPriceSectionLocator = By.id("buyNewSection");
    By bookPriceLocator = By.xpath("//span[@class='a-size-medium a-color-price offer-price a-text-normal']");
    By addToCartLocator = By.id("add-to-cart-button");

    public BookDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void the_title_is(String expectedBookTitle) throws Throwable {
        String actualBookTitle = driver.findElement(bookTitleLocator).getText();
        Assert.assertTrue(actualBookTitle.startsWith(expectedBookTitle));
    }

    public void it_is_a_Paperback_copy(String expectedBookType) throws Throwable {
        String actualBookType = driver.findElement(bookTypeLocator).getText();
        Assert.assertEquals("The book type is different than expected", expectedBookType, actualBookType);

    }

    public void it_s_price_is(String expectedBookPrice) throws Throwable {
        String actualBookPrice = driver.findElement(bookPriceSectionLocator).findElement(bookPriceLocator).getText();
        Assert.assertEquals("The book price is different than expected", expectedBookPrice, actualBookPrice);

    }

    public void i_click_on_add_to_basket() throws Throwable {
        driver.findElement(addToCartLocator).click();
    }
}
