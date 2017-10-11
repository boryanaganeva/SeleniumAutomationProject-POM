package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BooksSectionPage {
    WebDriver driver;

    By searchBoxLocator = By.id("twotabsearchtextbox");
    By submitSearchLocator = By.className("nav-input");

    public BooksSectionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void i_should_be_on_section(String expectedBookSectionPageTitle) throws Throwable {
       String actualBookSectionPageTitle = driver.getTitle();
       Assert.assertEquals("The page title is different than expected", expectedBookSectionPageTitle, actualBookSectionPageTitle);

    }

    public void i_enter_the_text_in_the_search_box(String searchedBook) throws Throwable {
        WebElement searchBox = driver.findElement(searchBoxLocator);
        searchBox.click();
        searchBox.sendKeys(searchedBook);
    }

    public void i_click_the_search_icon() throws Throwable {
        driver.findElement(submitSearchLocator).click();

    }
}
