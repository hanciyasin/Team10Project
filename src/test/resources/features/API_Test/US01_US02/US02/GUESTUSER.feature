@us02_API
Feature: Register
  Scenario: Aday öğrenci  kayıt  testi
    Given GUEST icin URL duzenlenir
    And GUEST USER icin payload duzenlenir
    When GUEST USER POST Request gonderilir ve Reponse alinir
    Then Status kodun 401 oldugu dogrulanir.
    And GUEST USER icin gelen Response body dogrulanir
