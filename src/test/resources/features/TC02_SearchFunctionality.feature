@TC02
Feature: Search Functionality

  Background: For the scenarios in the Search Functionality, user is expected to be on on the library login page
    Given Open the Application URL in any supported browser

@Placeholder
  Scenario: Validate search box has placeholder
    When  Do not enter anything into the Search text box field
    And   Click on the enter button
    Then  Proper placeholder text is displayed in the search text box field

  @ExistingProduct
  Scenario: Validate searching with an existing Product Name
    When  Enter any existing product name into the Search text box field
    And   Click on the enter button
    Then  Searched product should be displayed in the search results

  @NonExistingProduct
  Scenario: Validate searching with a non existing Product
    When  Enter non existing product name into the Search text box field
    And   Click on the enter button
    Then  Search error text should be displayed in the Search Results page

  @WithoutProduct
  Scenario: Validate searching without providing any Product Name
    When  Do not enter anything into the Search text box field
    And   Click on the enter button
    Then  There is no product that matches the search criteria should be displayed in the Search Results page