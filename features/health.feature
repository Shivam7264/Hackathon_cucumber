Feature: Health insurance Validation

  @regression
  Scenario: validating menu list Items
    Given user policy bazar website
    When user hovers to insuarance products
    Then user can see menu list Items
