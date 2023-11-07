@US05
Feature: ManagementSchool UI Test

  @US05_01
  Scenario: TC01 Admin Dean'lerin Name,Gender,PhoneNumber,SSN,UserName bilgilerini görebilmeli
    Given admin management school sayfasina gider
    Then Homepage login butonuna tiklar
    And Admin propertiesten name icin "manSchoolAdmin" ve bilgilerini girer
    And Admin propertiesten password icin "manSchoolAdminPass" ve bilgilerini girer
    But Admin 3 saniye bekler
    And Menu elementine tiklanir
    But Admin 3 saniye bekler
    And Main menuden Dean Manegement secilir
    And sayfada scrol yapilir
    Then name bilgisi gorunur
    Then gender bilgisi gorunur
    Then phone bilgisi gorunur
    Then ssn bilgisi gorunur
    Then username bilgisi gorunur
    And sayfa kapatilir