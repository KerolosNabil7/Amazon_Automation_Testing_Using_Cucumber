# Amazon_Automation_Testing_Using_Cucumber

Test Amazon Website Using Selenium With Java Covering The following Test Cases This automation task was built by using TestNg, POM Design Pattern, Data Providers, Cucumber with Gherkin language, maven-cucumber-reporting reporting tool and Assertions.

First Feature containing 1 Scenario about Searching for a Category
  Scenario: Search for an item's category
    1-Given user in home page
    2-When user write an CategoryName in search bar
    3-And click to the search button
    4-Then user should be taken to item's category search result page

Second Feature containing 1 Scenario about Adding an item to Cart
  Scenario: Add item to the cart
    1-Given user in item page
    2-When user add item to cart
    3-Then the item should added successfully
