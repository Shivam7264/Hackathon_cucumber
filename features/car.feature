Feature: CAR insurance Validation

  @sanity
  Scenario: validating error message
    Given User clicks on car Insurance
    When user clicked do not know car number
    And user choose city and city number
    And user choose a Car Brand
    And user choose a Car model
    And user select fuel type as petrol
    And user select a variant of car
    Then user filled all his details with invalid email
    Then user can see the error message
