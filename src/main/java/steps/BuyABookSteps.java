package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverFactory;

import pageobject.*;

public class BuyABookSteps {

    @Given("^I navigate to Amazon$")
    public void i_navigate_to_Amazon() throws Throwable {
        DriverFactory.getDriver().navigate().to("https://www.amazon.co.uk/");
        DriverFactory.getDriver().manage().window().maximize();
        Thread.sleep(2000);
    }

    @Given("^I'm on Amazon Landing Page$")
    public void i_am_on_amazon_page() throws Throwable {
        new AmazonLandingPage(DriverFactory.getDriver()).i_am_on_amazon_page(landingPageTitle);
    }

    @When("^I navigate to all sections$")
    public void i_navigate_to_all_sections() throws Throwable {
        new AmazonLandingPage(DriverFactory.getDriver()).i_navigate_to_all_sections();
        Thread.sleep(2000);
    }

    @Then("^I should see listed all sections$")
    public void i_should_see_listed_all_sections() throws Throwable {
        new AllDepartmentsPage(DriverFactory.getDriver()).i_should_see_listed_all_sections(allDepartmentsPageTitle);
    }

    @When("^I click on '(.*)' section$")
    public void i_click_on_section(String arg1) throws Throwable {
        new AllDepartmentsPage(DriverFactory.getDriver()).i_click_on_section();
        Thread.sleep(2000);
    }

    @Then("^I should be on '(.*)' section$")
    public void i_should_be_on_section(String arg1) throws Throwable {
        new BooksSectionPage(DriverFactory.getDriver()).i_should_be_on_section(booksSectionPageTitle);
    }

    @When("^I enter the text '(.*)' in the search box$")
    public void i_enter_the_text_in_the_search_box(String arg1) throws Throwable {
        new BooksSectionPage(DriverFactory.getDriver()).i_enter_the_text_in_the_search_box(searchedBookTitle);
        Thread.sleep(2000);
    }

    @When("^I click the search icon$")
    public void i_click_the_search_icon() throws Throwable {
        new BooksSectionPage(DriverFactory.getDriver()).i_click_the_search_icon();
        Thread.sleep(2000);
    }


    @Then("^The title of the first listed item should be '(.*)'$")
    public void the_title_of_the_first_listed_item_should_be(String arg1) throws Throwable {
        new SearchResultsPage(DriverFactory.getDriver()).the_title_of_the_first_listed_item_should_be(titleFirstReturnedItem);
    }

    @Then("^it should be a Paperback copy$")
    public void it_should_be_a_Paperback_copy() throws Throwable {
        new SearchResultsPage(DriverFactory.getDriver()).it_should_be_a_Paperback_copy(expectedBookType);
    }

    @Then("^it's price should be '(.*)'$")
    public void it_s_price_should_be(String arg1) throws Throwable {
        new SearchResultsPage(DriverFactory.getDriver()).it_s_price_should_be(expectedBookPrice);
        Thread.sleep(2000);
    }

    @When("^I click the first listed item$")
    public void i_click_on_the_first_listed_item() throws Throwable {
        new SearchResultsPage(DriverFactory.getDriver()).i_click_on_the_first_listed_item();
        Thread.sleep(2000);
    }

    @Then("^the title is '(.*)'$")
    public void the_title_is(String arg1) throws Throwable {
        new BookDetailsPage(DriverFactory.getDriver()).the_title_is(titleFirstReturnedItem);
        Thread.sleep(2000);
    }

    @Then("^it is a Paperback copy$")
    public void it_is_a_Paperback_copy() throws Throwable {
        new BookDetailsPage(DriverFactory.getDriver()).it_is_a_Paperback_copy(expectedBookType);
    }

    @Then("^it's price is '(.*)'$")
    public void it_s_price_is(String arg1) throws Throwable {
        new BookDetailsPage(DriverFactory.getDriver()).it_s_price_is(expectedBookPrice);
        Thread.sleep(2000);
    }

    @When("^I navigate to '(.*)'$")
    public void i_click_on_add_to_basket(String arg1) throws Throwable {
        new BookDetailsPage(DriverFactory.getDriver()).i_click_on_add_to_basket();
        Thread.sleep(2000);
    }

    @Then("^a notification is shown$")
    public void a_notification_is_shown() throws Throwable {
        new ShoppingBasketPage(DriverFactory.getDriver()).a_notification_is_shown();
    }

    @Then("^there should be a text '(.*)'$")
    public void there_should_be_a_text(String arg1) throws Throwable {
        new ShoppingBasketPage(DriverFactory.getDriver()).there_should_be_a_text(expectedNotification);
    }

    @Then("^the item is the basket should be one$")
    public void the_item_is_the_basket_should_be_one() throws Throwable {
        new ShoppingBasketPage(DriverFactory.getDriver()).the_item_is_the_basket_should_be_one(expectedItemQuantity);
    }

    @When("^I navigate to '(.*)' button to edit the basket$")
    public void i_navigate_to_button_to_edit_the_basket(String arg1) throws Throwable {
        new ShoppingBasketPage(DriverFactory.getDriver()).i_navigate_to_button_to_edit_the_basket();
        Thread.sleep(2000);
    }

    @Then("^I should be in Edit Shopping Basket$")
    public void i_should_be_in_the_Shopping_Basket() throws Throwable {
        new EditBasketPage(DriverFactory.getDriver()).i_should_be_in_Edit_Shopping_Basket();
    }

    @Then("^the title says '(.*)'$")
    public void the_title_says(String arg1) throws Throwable {
        new EditBasketPage(DriverFactory.getDriver()).the_title_says(titleFirstReturnedItem);
    }

    @Then("^it is a Paperback book$")
    public void it_is_a_Paperback_book() throws Throwable {
        new EditBasketPage(DriverFactory.getDriver()).it_is_a_Paperback_book(expectedBookType);

    }

    @Then("^it is with price of '(.*)'$")
    public void it_is_with_price_of(String arg1) throws Throwable {
        new EditBasketPage(DriverFactory.getDriver()).it_is_with_price_of(expectedBookPrice);
    }


    @Then("^it's quantity is one$")
    public void it_s_quantity_is_one() throws Throwable {
        new EditBasketPage(DriverFactory.getDriver()).it_s_quantity_is_one(expectedItemQuantity);

    }

    @Then("^the total price is '(.*)'$")
    public void the_total_price_is(String arg1) throws Throwable {
        new EditBasketPage(DriverFactory.getDriver()).the_total_price_is(expectedBookPrice);
    }

    private static final String allDepartmentsPageTitle = "Amazon.co.uk - Earth's Biggest Selection";
    private static final String landingPageTitle = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";
    private static final String booksSectionPageTitle = "Amazon.co.uk's Book Store";
    private static final String searchedBookTitle = "Harry Potter and the Cursed Child";
    private static final String titleFirstReturnedItem = "Harry Potter and the Cursed Child - Parts One and Two";
    private static final String expectedBookType = "Paperback";
    private static final String expectedBookPrice = "£4.00";
    private static final String expectedNotification = "Added to Basket";
    private static final String expectedItemQuantity = "1";
}