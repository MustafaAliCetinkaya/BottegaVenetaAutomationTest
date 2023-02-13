@TC01
Feature: Register Functionality

  Scenario: Test01 Register User
    Given The user is on the homepage
    Then  Verify that home page is visible successfully
    And   Click on Go to accept all cookies button
    And   Click on my account button from the left hand side menu
    Then  Verify New Customer is visible
    And   Click on the create my profile button
    Then  Verify that Create my profile is visible
    And   Fill all the required fields
    And   Select checkbox Sign up for our newsletter!
    And   Click Create My Profile button