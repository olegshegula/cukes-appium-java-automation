Feature: Login
  As a user
  I want to login to the app

  Scenario: Verify Sign In with App
    Given I am on the 'Sign In' screen
    When I sign in with "test@test.com" and "test123"
    Then I am signed in successfully and I am taken to the lobby screen