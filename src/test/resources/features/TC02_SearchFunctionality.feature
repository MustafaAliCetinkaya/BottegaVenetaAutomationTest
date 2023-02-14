@TC02
Feature: Search Functionality

  Background: For the scenarios in the Search Functionality, user is expected to be on on the  homepage
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
    And   Click on any item from the search results
    Then  User should be able to see the product name header
    And   Click on the product details button
    Then  User should be able to see the all product details (Made in, material, product code, other details)


  @NonExistingProduct
  Scenario: Validate searching with a non existing Product
    When  Enter non existing product name into the Search text box field
    And   Click on the enter button
    Then  Search error text should be displayed in the Search Results page

  @WithoutProduct
  Scenario: Validate searching without providing any Product Name
    When  Do not enter anything into the Search text box field
    And   Click on the enter button
    Then  All products at the store should be displayed in the Search Results page