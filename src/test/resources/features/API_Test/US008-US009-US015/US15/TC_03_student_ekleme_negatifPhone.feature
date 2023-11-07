@vicedean @apiTestius15NegatifPhone
Feature: Student Ekleme Testi(Negatif Phone Bilgileri ile)
  Scenario: Student basarili bir sekilde eklenememeli
    Given Student eklemek icin Post request hazirligi yapilir
    And Gonderilecek student bilgileri hazirlanir(Phone Bilgisi Eksik)
    When Student eklemek icin eksik Phone bilgileri ile Post request gonderilir
    Then Eksik Phone bilgisi dogrulama yapilir.