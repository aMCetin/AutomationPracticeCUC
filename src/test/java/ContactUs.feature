
Feature: Contact Us Test

  Scenario: Go to website and test Contact Us Page

    Given navigate to website
    And click on Contact Us button
    And select Subject Heading
    And type Email
    And type Order Reference
    And type a message
    When click on Submit button
    Then verify success message
