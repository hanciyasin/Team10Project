@US15_TC01
Feature: Student Ekleme Testi
  Scenario: Student basarili bir sekilde eklenebilmeli
    Given Student eklemek icin Post request hazirligi yapilir
    And Gonderilecek student bilgileri hazirlanir
    When Student eklemek icin Post request gonderilir
    Then Student bilgileri dogrulanir

    Scenario: Eklenen Student silinebilmeli
    When Student delete
