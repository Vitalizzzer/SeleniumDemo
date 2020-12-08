@CucumberTest
Feature: Test calculator web application

  Background:
    Given driver configuration

  Scenario Outline: Test operations
    Given first number '<FirstNumber>'
    And second number '<SecondNumber>'
    And chosen operator '<Operator>'
    When click go button
    Then result is '<Result>'

    Examples:
      | FirstNumber | SecondNumber | Operator | Result |
      | 5           | 2            | *        | 10     |
#      | 14          | 6            | +        | 20     |
#      | 235         | 34           | -        | 201    |
#      | 15          | 6            | /        | 2.5    |
