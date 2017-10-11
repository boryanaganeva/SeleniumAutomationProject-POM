Feature: Add a book to basket on Amazon
  As a user
  I want to buy a book

  Scenario: Find a book and add it to the shopping basket
    Given I navigate to Amazon
    And I'm on Amazon Landing Page
    When I navigate to all sections
    Then I should see listed all sections
    When I click on 'Books' section
    Then I should be on 'Books' section
    When I enter the text 'Harry Potter and the Cursed Child' in the search box
    And I click the search icon
    Then The title of the first listed item should be 'Harry Potter and the Cursed Child - Parts One and Two'
    And it should be a Paperback copy
    And it's price should be '£4.00'
    When I click the first listed item
    Then the title is 'Harry Potter and the Cursed Child - Parts One and Two'
    And it is a Paperback copy
    And it's price is '£4.00'
    When I navigate to 'Add to Basket'
    Then a notification is shown
    And there should be a text 'Basket subtotal (1 item): £3.85'
    And the item is the basket should be one
    When I navigate to 'Edit basket' button to edit the basket
    Then I should be in Edit Shopping Basket
    And the title says 'Harry Potter and the Cursed Child - Parts One and Two'
    And it is a Paperback book
    And it is with price of '£4.00'
    And it's quantity is one
    And the total price is '£4.00'





