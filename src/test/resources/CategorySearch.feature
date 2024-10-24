Feature: Search for an item's category
  In order to search
  As a valid user
  I want search about item's category successfully

  Scenario: Search for an item's category
    Given user in home page
    When user write an CategoryName in search bar
    And click to the search button
    Then user should be taken to item's category search result page
