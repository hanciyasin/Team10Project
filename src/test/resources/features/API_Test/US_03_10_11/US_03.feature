@API_03
Feature: US03 Contact Message API Test

  Scenario Outline: Mesaj post ve kontrol etme
    Given Contact Message save icin URL Duzenlenir
    Then  Contact Message save icin payload olusturulur  "<email>" "<message>" "<name>" "<subject>".
    When  Contact Message save icin Post request gonderilir ve response alinir.
    And   Contact Message Post sonrasi gelen response dogrulanir.

    Examples:
      | email             | message      | name | subject |
      | contact@gmail.com | My_Message@1 | User | Lessons |