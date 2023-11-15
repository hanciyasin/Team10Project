@us02_API
Feature: Register
  Scenario: MİSAFİR  KULLANICI  testi
    Given GUEST icin URL duzenlenir
    And GUEST USER icin payload duzenlenir
    When GUEST USER POST Request gonderilir ve Reponse alinir
    Then Status Kodun 200 oldugu dogrulanir
    And GUEST USER icin gelen Response body dogrulanir
