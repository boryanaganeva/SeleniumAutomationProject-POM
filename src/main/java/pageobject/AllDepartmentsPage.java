package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllDepartmentsPage {

    WebDriver driver;

    By sectionBooksLocator = By.xpath("//a[@href='/books-used-books-textbooks/b/ref=sd_allcat_bo_books?ie=UTF8&node=266239']");

    public AllDepartmentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void i_should_see_listed_all_sections(String expectedAllDeptPageTitle) throws Throwable {

        String actualAllDeptPageTitle = driver.getTitle();
        Assert.assertEquals("The page title is different than expected", expectedAllDeptPageTitle, actualAllDeptPageTitle);
    }

    public void i_click_on_section() throws Throwable {
        WebElement sectionBooks = driver.findElement(sectionBooksLocator);
        sectionBooks.click();
    }
}