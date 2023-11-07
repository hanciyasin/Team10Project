@US04
Feature: ManagementSchool UI Test

Background:
  Given admin management school sayfasina gider
  Then Homepage login butonuna tiklar
  And Admin propertiesten name icin "manSchoolAdmin" ve bilgilerini girer
  And Admin propertiesten password icin "manSchoolAdminPass" ve bilgilerini girer
  But Admin 3 saniye bekler
  And Menu elementine tiklanir
  But Admin 3 saniye bekler
  And Main menuden Dean Manegement secilir
  But Admin 2 saniye bekler
  And Add Dean bolumunden Name bilgisi girer
  And Add Dean bolumunden Surname bilgisi girer
  And Add Dean bolumunden Birthplace bilgisi girer
  And Add Dean bolumunden Gender secer
  And Add Dean bolumunden DateOfBirth bilgisi girer
  And Add Dean bolumunden Phone bilgisi girer
  And Add Dean bolumunden userName bilgisi girer
  And Add Dean bolumunden deanPassword bilgisi girer

  @US04_10
  Scenario: TC10 SSN Negatif Senaryolar
    And Add Dean bolumunden SSN bolumune sadece harf girer
    And Submit butonuna tiklar
    And hata mesaji alir
    And sayfa kapatilir

  @US04_11
  Scenario: TC11 SSN Negatif Senaryolar
    And Add Dean bolumunden SSN bolumune - kullanmadan giris yapar
    And Submit butonuna tiklar
    And hata mesaji alir
    And sayfa kapatilir

  @US04_12
  Scenario: TC12 SSN Negatif Senaryolar
    And Add Dean bolumunden SSN bolumune dokuz karakterden az giris yapar
    And Submit butonuna tiklar
    And zorunlu alan girilmedigi icin ssn karakter hatasi mesajini alir
    And sayfa kapatilir

  @US04_13
  Scenario: TC13 SSN Negatif Senaryolar
    And Add Dean bolumunden SSN bolumune dokuz karakterden fazla giris yapar
    And Submit butonuna tiklar
    And hata mesaji alir
    And sayfa kapatilir
