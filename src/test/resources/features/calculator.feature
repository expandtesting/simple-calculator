Feature: Simple number arithmetic
  As a user
  I want to be able to do simple number arithmetic
  So that I can answer my exam questions

  Scenario: Add two numbers
    Given the numbers 3 and 4
    When I add the two numbers
    Then the result should be 7

  Scenario: Subtract two numbers
    Given the numbers 5 and 1
    When I subtract the two numbers
    Then the result should be 4


  Scenario Outline: Add two numbers with table
    Given the numbers <number1> and <number2>
    When I add the two numbers
    Then the result should be <result>
    Examples:
      | number1 | number2 | result |
      | 1       | 5       | 6      |
      | 3       | 6       | 9      |