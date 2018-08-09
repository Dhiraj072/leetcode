Feature: Roman to Integer Conversion

  Scenario Outline: Test Roman to Integer conversion
    Given I have a Roman to Integer converter
    When I provide the roman numeral <roman>
    Then the integer result is <integer>

    Examples:
    |  roman    |   integer   |
    |   III     |     3       |
    |   IV      |     4       |
    |   VII     |     7       |
    |   LVIII   |     58      |
    |   MCMXCIV |     1994    |
    |   CDI     |     401     |