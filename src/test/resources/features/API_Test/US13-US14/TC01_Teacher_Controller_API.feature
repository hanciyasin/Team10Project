@API_TC01
Feature: Vice Dean Ogretmen olusturma

  Scenario: US13-API  Vice Dean Teacher i basarili bir sekilde ekleyebilmeli
    Given Teacher eklemek icin Post request hazirligi yapilir.
    And Gonderilecek Teacher bilgileri hazirlanir.
    When Teacher eklemek icin Post request gonderilir.
    Then Teacher bilgileri dogrulanir.
    Then kullanici olusturulan Teacheri update eder
    #Then kullanici olusturulan Teacheri siler.