@US04
Feature: ManagementSchool UI Test

  @US04_05
  Scenario Outline: TC05 Gender bos birakilamamali
    Given admin management school sayfasina gider
    Then Homepage login butonuna tiklar
    And Admin scenarioOutline ile propertiesden "<username>" ve "<password>" bilgilerini girer
    But Admin 3 saniye bekler
    And Menu elementine tiklanir
    But Admin 3 saniye bekler
    And Main menuden Dean Manegement secilir
    But Admin 2 saniye bekler
    And Add Dean bolumunden Name bilgisi girer
    And Add Dean bolumunden Surname bilgisi girer
    And Add Dean bolumunden Birthplace bilgisi girer
    And Add Dean bolumunden DateOfBirth bilgisi girer
    And Add Dean bolumunden Phone bilgisi girer
    And Add Dean bolumunden SSN bilgisi girer
    And Add Dean bolumunden userName bilgisi girer
    And Add Dean bolumunden deanPassword bilgisi girer
    And Submit butonuna tiklar
    And sonuc mesaji gorunur
    And sayfa kapatilir

    Examples:
      | username       | password           |
      | manSchoolAdmin | manSchoolAdminPass |
