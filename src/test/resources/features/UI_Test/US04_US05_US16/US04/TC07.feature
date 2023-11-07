@US04
Feature: ManagementSchool UI Test

  @US04_07
  Scenario Outline: TC07 Date of Birth kismina gelecek tarih girilmemeli
    Given admin management school sayfasina gider
    Then Homepage login butonuna tiklar
    And Admin scenarioOutline ile propertiesden "<username>" ve "<password>" bilgilerini girer
    But Admin 3 saniye bekler
    And Menu elementine tiklanir
    But Admin 3 saniye bekler
    And Main menuden Dean Manegement secilir
    And Add Dean bolumunden Name bilgisi girer
    And Add Dean bolumunden Surname bilgisi girer
    And Add Dean bolumunden Birthplace bilgisi girer
    And Add Dean bolumunden Gender secer
    And Add Dean bolumunden Phone bilgisi girer
    And Add Dean bolumunden SSN bilgisi girer
    And Add Dean bolumunden userName bilgisi girer
    And Add Dean bolumunden deanPassword bilgisi girer
    And Add Dean bolumunden gelecekte bir DateOfBirth bilgisi girer
    And Submit butonuna tiklar
    And gelecek tarih hata mesaji alinir
    And sayfa kapatilir

    Examples:
      | username       | password           |
      | manSchoolAdmin | manSchoolAdminPass |
