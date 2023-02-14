@TC01
Feature: Register Functionality

  Background: For the scenarios in the Search Functionality, user is expected to be on on the homepage
    Given Open the Application URL in any supported browser

  @Register
  Scenario: Register User
    Then  Verify that home page is visible successfully
    And   Click on my account button from the left hand side menu
    Then  Verify New Customer is visible
    And   Click on the create my profile button
    Then  Verify that Create my profile is visible
    And   Fill all the required fields
    And   Select checkbox Sign up for our newsletter!
    And   Click Create My Profile button

  @VerifyAllWarningMessages
  Scenario: Validate proper notification messages are displayed for the mandatory fields, when you don't provide any fields in the 'Register Account' page and submit
    When  Click on my account button from the left hand side menu
    And   Click on the create my profile button
    And   Click on the create my profile button
    And   Do not enter anything into the required fields and Click Create My Profile button
    Then  Related warning messages should be displayed for the respective fields