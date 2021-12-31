Feature: Guru99



@smoke
   Scenario: Verify header
     When The user wants to verify header is "Mother Elephant With Babies Soft Toy"

@smoke
  Scenario: Verify toy price
    When The user wants to verify that toy price is "$20"
@smoke
  Scenario: Verify url
    When The user wants to verify that url contains "payment-gateway"

@regression
  Scenario: Verify that you can purchase 5 toys
    When The user want to choose quantity as "5"
    Then The user wants to click on BUY NOW button
    And The user wants to enter payment information as
    |cardNumber|1234432156788765 |
    |expMonth  |03               |
    |expYear   |2023             |
    |cvvCode   |012              |
    And The user wants to click pay
    Then The user wants to verify "Payment successfull!" message

@regression
 Scenario Outline: Order in different quantities
    When The user want to choose quantity as "<quantity>"
    Then The user wants to click on BUY NOW button
    And The user wants to enter payment information as
      |cardNumber|1234432156788765 |
      |expMonth  |03               |
      |expYear   |2023             |
      |cvvCode   |012              |
    And The user wants to click pay
    Then The user wants to verify "Payment successfull!" message

  Examples:
  | quantity |
  | 5         |
  | 8         |
  | 9         |
  | 2         |
  | 4         |






