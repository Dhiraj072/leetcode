Feature: Test buy and sell stocks max profit calculation

    Scenario Outline: Positive max profit
    Given I have a Best Time To Buy And Sell Stock calculator
    When the stock prices are <prices>
    Then the maximum profit I can make is <max_profit>

    Examples:
    | prices          | max_profit  |
    | "1,2,3,4"       |     3       |
    | "7,1,5,3,6,4"   |     5       |
    | "7,5,3,2,1"     |     0       |
    | ""              |     0       |
    | "1"             |     0       |
    | "1,2"           |     1       |
