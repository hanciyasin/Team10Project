Feature: Vice Dean ders listesini gorebilmeli ve guncellemeler yapabilmelidir.

  Background:
    Given Kullanici management school sayfasina gider
    Then Kullanici 3 saniye bekler
    Then Kullanici Login yazisina tiklar
    Then Kullanici User Name alanina "VDUserName" password alanina "VDPassword" degerini girip giris yapar
    Then Kullanici 3 saniye bekler

  Scenario: Tc01 Vice Dean ders listesini gorebilmelidir
    Given kullanici lessons a tiklar
    Then kullanıcı ders listesine scroll yapar
    And Kullanici 1 saniye bekler
    And kullanıcı lesson  list'i görür
    And Kullanici 2 saniye bekler
    And sayfa kapatilir

  Scenario: Tc02 Vice Dean ders silebilmelidir
    Given kullanici lessons a tiklar




