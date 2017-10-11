package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

        WebDriver driver;

        By firstItemLocator = By.id("result_0");
        By firstItemTitleLocator = By.xpath("//h2[contains(text(),'Harry Potter and the Cursed Child - Parts One and Two')]");
        By firstBookTypeLocator = By.xpath("//h3[@data-attribute='Paperback']");
        By firstBookPriceLocator = By.xpath("//span[@class='a-size-base a-color-price s-price a-text-bold']");


        public SearchResultsPage(WebDriver driver) {
            this.driver = driver;
        }

    public void the_title_of_the_first_listed_item_should_be(String expectedFirstReturnedItem) throws Throwable {
        String actualFirstReturnedItem = driver.findElement(firstItemLocator).findElement(firstItemTitleLocator).getText();
        Assert.assertTrue(actualFirstReturnedItem.startsWith(expectedFirstReturnedItem));
    }

    public void it_should_be_a_Paperback_copy(String expectedBookType) throws Throwable {
        String actualBookType = driver.findElement(firstBookTypeLocator).getText();
        Assert.assertEquals("The book type is different than expected", expectedBookType, actualBookType);
    }

    public void it_s_price_should_be(String expectedBookPrice) throws Throwable {
        String actualBookPrice = driver.findElement(firstItemLocator).findElement(firstBookPriceLocator).getText();
        Assert.assertEquals("The book price is different than expected", expectedBookPrice, actualBookPrice);
    }

    public void i_click_on_the_first_listed_item() throws Throwable {
        driver.findElement(firstItemLocator).findElement(firstItemTitleLocator).click();
    }
}
