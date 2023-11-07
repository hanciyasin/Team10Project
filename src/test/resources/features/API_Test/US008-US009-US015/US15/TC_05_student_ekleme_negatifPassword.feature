@vicedean @apiTestius15NegatifPassword
Feature: Student Ekleme Testi(Negatif Password Bilgileri ile)
  Scenario: Student basarili bir sekilde eklenememeli
    Given Student eklemek icin Post request hazirligi yapilir
    And Gonderilecek student bilgileri hazirlanir(Password Bilgisi Eksik)
    When Student eklemek icin eksik Password bilgileri ile Post request gonderilir
    Then Eksik Password bilgisi dogrulama yapilir.