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
    And Add Dean bolumunden SSN bilgisi girer
    And Add Dean bolumunden userName bilgisi girer

  @US04_14
  Scenario: TC14 Password Negatif Senaryolar
    And Add Dean bolumunden Password kismina sekiz den az karakter girer
    And Submit butonuna tiklar
    And zorunlu alan girilmedigi icin password karakter hatasi mesajini alir
    And sayfa kapatilir

  @US04_15
  Scenario: TC15 Password Negatif Senaryolar
    And Add Dean bolumunden Password kismina buyuk harf girmez
    And Submit butonuna tiklar
    And zorunlu alan girilmedigi icin password karakter hatasi mesajini alir
    And sayfa kapatilir

  @US04_16
  Scenario: TC16 Password Negatif Senaryolar
    And Add Dean bolumunden Password kismina kucuk harf girmez
    And Submit butonuna tiklar
    And zorunlu alan girilmedigi icin password karakter hatasi mesajini alir
    And sayfa kapatilir

  @US04_17
  Scenario: TC17 Password Negatif Senaryolar
    And Add Dean bolumunden Password rakam yerine sadece harf girer
    And Submit butonuna tiklar
    And zorunlu alan girilmedigi icin password karakter hatasi mesajini alir
    And sayfa kapatilir