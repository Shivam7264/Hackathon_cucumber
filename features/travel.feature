Feature: Travel insurance Validation

  @sanity
  Scenario: validating lowest travel insurance for 2 person
    Given User clicks on Travel Insurance
    When user filled an European country in destination details and click on next
    And user filled trip date and click on next
    And user filled 2 traveller and ages 21 and 22 and click next
    And user filled medical fitness No
    And user provideds a valid phone number to get updates and click view plans
    And user applied the sort by filter low to high
    Then user see the lowest insurance policy details
