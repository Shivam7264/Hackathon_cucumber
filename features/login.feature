Feature: Login details validation

  @sanity
  Scenario: validation of login details
    Given User navigated to home Page
    When user clicked on sign in button
    And user filled inavlid mobile number
    Then user can see error message Invalid number

 