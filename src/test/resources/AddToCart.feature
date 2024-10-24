Feature: Add item to the Cart
  In order to buy an item
  As a valid user
  I want to Add item to cart successfully

  Scenario: Add item to the cart
    Given user in item page
    When user add item to cart
    Then the item should added successfully