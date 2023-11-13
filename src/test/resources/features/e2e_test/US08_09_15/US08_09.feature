@E2E_US08_09
Feature: Leeson Controller e2e

  Scenario: US08 Vice Dean Ders ekleme
    Given Kullanici management school sayfasina gider
    Then Kullanici 3 saniye bekler
    Then Kullanici Login yazisina tiklar
    Then Kullanici User Name alanina "VDUserName" password alanina "VDPassword" degerini girip giris yapar
    Then Kullanici 3 saniye bekler
    Given kullanici lessons a tiklar
    Then  Kullanici 1 saniye bekler
    Then lesson name ve credit Score'i yaz
    And Compulsory kismini seç
    And Kullanici 1 saniye bekler
    And kullanici Submit butonuna tiklar
    Then kullanıcı ders listesine scroll yapar
    And Kullanici 1 saniye bekler
    And kullanıcı lesson  list'i görür
    And Kullanici 2 saniye bekler
    And sayfa kapatilir

  Scenario: US09 lesson list getAll
    Given lessons listesi alinir
    Then Status kodun 200 oldugu dogrulanır
    And lesson id ile ders kontrolu yapilir
    When lesson delete icin url duzenlenir
    Then Kayitli lesson silinir
    And lesson silindigi dogrulanır
    Then Status kodun 200 oldugu dogrulanır

