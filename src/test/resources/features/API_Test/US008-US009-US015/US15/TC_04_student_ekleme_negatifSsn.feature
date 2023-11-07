@vicedean @apiTestius15NegatifSsn
Feature: Student Ekleme Testi(Negatif Ssn Bilgileri ile)
  Scenario: Student basarili bir sekilde eklenememeli
    Given Student eklemek icin Post request hazirligi yapilir
    And Gonderilecek student bilgileri hazirlanir(Ssn Bilgisi Eksik)
    When Student eklemek icin eksik Ssn bilgileri ile Post request gonderilir
    Then Eksik Ssn bilgisi dogrulama yapilir.