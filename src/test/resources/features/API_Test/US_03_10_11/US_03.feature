Feature: US03 Contact Message API Test

  Scenario Outline: Mesaj post ve kontrol etme
    Given Kullanici path params olusturur Contact
    Then  Kullanici expected data olusturur "<email>" "<message>" "<name>" "<subject>"
    When  Kullanici request gonderir response alir Contact
    And   Kullanici dogrulama yapar Contact Pozitif

    Examples:
      | email | message | name | subject |
      |       |         |      |         |