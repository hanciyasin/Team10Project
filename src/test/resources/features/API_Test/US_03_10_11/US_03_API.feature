@US_03_API
Feature: US_03 Contact Message API Test
@03_01
  Scenario: Pozitif Contact Message Test
    Given Contact Message icin Url hazirlanir
    Then Contact Message icin payload olusturulur "<email>" "<message>" "<name>" "<subject>"
    When Contact Message icin Post request gonderilir
    And Gelen response ile dogrulama yapilir