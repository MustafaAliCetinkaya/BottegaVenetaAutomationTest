Feature: Forgot Password Functionality
@TC04
  Scenario:Validate the Password Reset functionality in all the supported environments
  Given Open the Application URL in any supported browser
  Then  Verify that home page is visible successfully
  And   Click on my account icon from the top right corner menu
  And   Click on Forgotten Password link from Login page
  And   Enter the email address of your existing account
  And   Click on the submit button
  Then  User should be able to see the email sent window
  And   Close the email sent window
