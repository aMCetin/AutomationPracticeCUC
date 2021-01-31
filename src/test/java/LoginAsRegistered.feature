
Feature:  Login Test

  Scenario:
    Given navigate to website
    And click signIn button
    And enter email
    And enter password
    When I click the signIn
    Then verify successfully login
