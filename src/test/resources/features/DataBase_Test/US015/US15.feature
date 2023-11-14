@DB_US15
Feature: Vice Dean Öğrenci olusturabilmeli.

  Scenario: US15 Vice Dean Öğrenci sorgulama ve doğrulama
    Given Database'e bağlanır.
    Given Student eklemek icin Post request hazirligi yapilir
    And Gonderilecek student bilgileri hazirlanir
    When Student eklemek icin Post request gonderilir
    And Aday ogrenci icin sorgulama yapar.
    And Aday ogrenci icin doğrulama yapar.
    Then Student delete