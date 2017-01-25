Feature: Registration
  As a user
  I want to register with the app

  Scenario: Verify Registration with App
    Given I am on the 'Create Account' screen
    When I register with the following details
          |"Mr"|"test"|"user"|"test@test.com|"1234"|
    Then I am registered successfully and I am taken to the lobby screen