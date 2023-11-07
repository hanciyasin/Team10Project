Feature: Vice Dean ders olusturma

  Background:
    Given Kullanici management school sayfasina gider
    Then Kullanici 3 saniye bekler
    Then Kullanici Login yazisina tiklar
    Then Kullanici User Name alanina "VDUserName" password alanina "VDPassword" degerini girip giris yapar
    Then Kullanici 3 saniye bekler

  Scenario: TC01_02 Vice Dean ders olustururken ders ismi ve kredi notu girmelidir
    Given kullanici lessons a tiklar
    Then  Kullanici 1 saniye bekler
    And  kullanici Submit butonuna tiklar
    And  Lesson name ve Credit Score altinda Required yazdigini dogrular
    And sayfa kapatilir


  Scenario: TC04 Vice Dean ders oluştururken ders ismi  ve Kredi notunu girmelidir
    Given kullanici lessons a tiklar
    Then lesson name i yaz
    And Compulsory kismini seç
    And Kullanici 1 saniye bekler
    And kullanici Submit butonuna tiklar
    And Dersin Eklendigini doğrula






