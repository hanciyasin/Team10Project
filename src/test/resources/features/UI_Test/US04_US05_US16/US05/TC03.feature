@US05
Feature: ManagementSchool UI Test

  @US05_03
  Scenario: TC03 Admin Dean bilgilerini guncelleyebilir
    Given admin management school sayfasina gider
    Then Homepage login butonuna tiklar
    And Admin propertiesten name icin "manSchoolAdmin" ve bilgilerini girer
    And Admin propertiesten password icin "manSchoolAdminPass" ve bilgilerini girer
    But Admin 3 saniye bekler
    And Menu elementine tiklanir
    But Admin 3 saniye bekler
    And Main menuden Dean Manegement secilir
    But Admin 2 saniye bekler
    Then Add Dean edit butonuna tiklar
    But Admin 3 saniye bekler
    And name bilgisini gunceller
    And surname bilgisini gunceller
    And birthplace bilgisini gunceller
    And gender bilgisini gunceller
    And dateOfBirth bilgisini gunceller
    And phone bilgisini gunceller
    And ssn bilgisini gunceller
    And username bilgisini gunceller
    And password bilgisini gunceller
    And Edit submit butonuna tiklar
    And sayfa kapatilir