Feature: US03 Contact Message API Test

  Scenario Outline: Mesaj post ve kontrol etme
    Given Contact Message save icin URL duzenlenir.
    Then  Contact Message save icin payload olusturulur.
    When  Contact Message save icin Post request gonderilir ve response alinir.
    And   Contact Message Post sonrasi gelen response dogrulanir.

    Examples:
      | email | message | name | subject |
      |       |         |      |         |