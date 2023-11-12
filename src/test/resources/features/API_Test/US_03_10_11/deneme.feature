Feature: US_03 Deneme Feature
  Scenario Outline:
    Given Given1 ile url
    Then Then payload "<email>" "<message>" "<name>" "<subject>"
    When When3 post
    And And4 ile kontrol
    Examples:
      | email             | message      | name | subject |
      | contact@gmail.com | My_Message@1 | User | Lessons |

