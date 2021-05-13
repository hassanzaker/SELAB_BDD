@tag
Feature: Calculator
  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     |  13    |
      | -1    | 6      |  5     |
      | 2     | 2      | 4      |
      | -12     | 2      | -10      |


  Scenario: operation two number
    Given Three input values, 3 and 2 and "/"
    When I operate the two values
    Then I expect the answer 1

  Scenario Outline: operation two number
    Given Three input values, <a> and <b> and <opt>
    When I operate the two values
    Then I expect the answer <ans>

    Examples:
      | a | b | opt | ans |
      | 2 | 1 | "/" | 2   |
      | -9 | 4 | "/" | -2   |
      | 2 | 2 | "^" | 4   |
      | -3 | 3 | "^" | -27   |
