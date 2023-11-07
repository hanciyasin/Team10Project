@vicedean @apiTestius15Negatif
Feature: Student Ekleme Testi(Negatif)
  Scenario: Student basarili bir sekilde eklenememeli
    Given Student eklemek icin Post request hazirligi yapilir
    And Student bilgileri girilmez.
    When Eksik bilgilerle Post request gonderilir
    Then Eksik Student bilgileri dogrulanir