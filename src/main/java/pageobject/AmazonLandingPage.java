package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLandingPage {

    WebDriver driver;

    By showAllDepartmentsLocator = By.id("nav-link-shopall");

    public AmazonLandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void i_am_on_amazon_page(String expectedFirstPageTitle) throws Throwable{
        String actualFirstPageTitle = driver.getTitle();
        Assert.assertEquals("The page title is different than expected", expectedFirstPageTitle, actualFirstPageTitle);
    }

    public void i_navigate_to_all_sections() throws Throwable {
        WebElement showAllDepartments = driver.findElement(showAllDepartmentsLocator);
        showAllDepartments.click();

    }
}


