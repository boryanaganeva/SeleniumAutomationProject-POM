$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BuyABook.feature");
formatter.feature({
  "line": 1,
  "name": "Add a book to basket on Amazon",
  "description": "As a user\r\nI want to buy a book",
  "id": "add-a-book-to-basket-on-amazon",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Find a book and add it to the shopping basket",
  "description": "",
  "id": "add-a-book-to-basket-on-amazon;find-a-book-and-add-it-to-the-shopping-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to Amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I\u0027m on Amazon Landing Page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I navigate to all sections",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see listed all sections",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \u0027Books\u0027 section",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should be on \u0027Books\u0027 section",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter the text \u0027Harry Potter and the Cursed Child\u0027 in the search box",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click the search icon",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "The title of the first listed item should be \u0027Harry Potter and the Cursed Child - Parts One and Two\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "it should be a Paperback copy",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "it\u0027s price should be \u0027£4.00\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click the first listed item",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "the title is \u0027Harry Potter and the Cursed Child - Parts One and Two\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "it is a Paperback copy",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "it\u0027s price is \u0027£4.00\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I navigate to \u0027Add to Basket\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "a notification is shown",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "there should be a text \u0027Basket subtotal (1 item): £3.85\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "the item is the basket should be one",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I navigate to \u0027Edit basket\u0027 button to edit the basket",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should be in Edit Shopping Basket",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "the title says \u0027Harry Potter and the Cursed Child - Parts One and Two\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "it is a Paperback book",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "it is with price of \u0027£4.00\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "it\u0027s quantity is one",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "the total price is \u0027£4.00\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "BuyABookSteps.i_navigate_to_Amazon()"
});
formatter.result({
  "duration": 8190765214,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.i_am_on_amazon_page()"
});
formatter.result({
  "duration": 29794986,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.i_navigate_to_all_sections()"
});
formatter.result({
  "duration": 2565220535,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.i_should_see_listed_all_sections()"
});
formatter.result({
  "duration": 15586326,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 12
    }
  ],
  "location": "BuyABookSteps.i_click_on_section(String)"
});
formatter.result({
  "duration": 3764747315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 16
    }
  ],
  "location": "BuyABookSteps.i_should_be_on_section(String)"
});
formatter.result({
  "duration": 17527348,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Cursed Child",
      "offset": 18
    }
  ],
  "location": "BuyABookSteps.i_enter_the_text_in_the_search_box(String)"
});
formatter.result({
  "duration": 2280865968,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.i_click_the_search_icon()"
});
formatter.result({
  "duration": 4122773382,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Cursed Child - Parts One and Two",
      "offset": 46
    }
  ],
  "location": "BuyABookSteps.the_title_of_the_first_listed_item_should_be(String)"
});
formatter.result({
  "duration": 51120027,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.it_should_be_a_Paperback_copy()"
});
formatter.result({
  "duration": 29581693,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£4.00",
      "offset": 22
    }
  ],
  "location": "BuyABookSteps.it_s_price_should_be(String)"
});
formatter.result({
  "duration": 2037408146,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.i_click_on_the_first_listed_item()"
});
formatter.result({
  "duration": 4791298024,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Cursed Child - Parts One and Two",
      "offset": 14
    }
  ],
  "location": "BuyABookSteps.the_title_is(String)"
});
formatter.result({
  "duration": 2094221699,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.it_is_a_Paperback_copy()"
});
formatter.result({
  "duration": 96131090,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£4.00",
      "offset": 15
    }
  ],
  "location": "BuyABookSteps.it_s_price_is(String)"
});
formatter.result({
  "duration": 2051954820,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add to Basket",
      "offset": 15
    }
  ],
  "location": "BuyABookSteps.i_click_on_add_to_basket(String)"
});
formatter.result({
  "duration": 3141468417,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.a_notification_is_shown()"
});
formatter.result({
  "duration": 43913268,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Basket subtotal (1 item): £3.85",
      "offset": 24
    }
  ],
  "location": "BuyABookSteps.there_should_be_a_text(String)"
});
formatter.result({
  "duration": 31842655,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.the_item_is_the_basket_should_be_one()"
});
formatter.result({
  "duration": 27712070,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit basket",
      "offset": 15
    }
  ],
  "location": "BuyABookSteps.i_navigate_to_button_to_edit_the_basket(String)"
});
formatter.result({
  "duration": 2804981889,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.i_should_be_in_the_Shopping_Basket()"
});
formatter.result({
  "duration": 67485715,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Cursed Child - Parts One and Two",
      "offset": 16
    }
  ],
  "location": "BuyABookSteps.the_title_says(String)"
});
formatter.result({
  "duration": 47535928,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.it_is_a_Paperback_book()"
});
formatter.result({
  "duration": 43732813,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£4.00",
      "offset": 21
    }
  ],
  "location": "BuyABookSteps.it_is_with_price_of(String)"
});
formatter.result({
  "duration": 40242105,
  "status": "passed"
});
formatter.match({
  "location": "BuyABookSteps.it_s_quantity_is_one()"
});
formatter.result({
  "duration": 20734268,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£4.00",
      "offset": 20
    }
  ],
  "location": "BuyABookSteps.the_total_price_is(String)"
});
formatter.result({
  "duration": 44675759,
  "status": "passed"
});
formatter.after({
  "duration": 782405109,
  "status": "passed"
});
});