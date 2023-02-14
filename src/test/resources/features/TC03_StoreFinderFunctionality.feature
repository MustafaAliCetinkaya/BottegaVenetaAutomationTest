@TC01
Feature: Store Finder Functionality

  Background: For the scenarios in the Store Finder Functionality, user is expected to be on on the homepage
    Given Open the Application URL in any supported browser

  Scenario: User should be able to find and see the store details from the store finder module
    Then  Verify that home page is visible successfully
    And   Click on my account button from the left hand side menu
    Then  Verify New Customer is visible
    And   Click on the store locator button
    Then  Verify that store finder header is visible
    And   Select a country from the dropdown button
    And   Select a city from the dropdown button
    And   Click on the choose button
    Then User should be able to see the store contact details
