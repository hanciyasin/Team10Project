@US04
Feature: ManagementSchool UI Test

  @US04_02_03_04_06_08_09
  Scenario: TC02-TC03-TC04-TC06-TC08-TC09 Name,Surname,BirthPlace,DateofBirth,Phone,SSN bos olamaz
    Given admin management school sayfasina gider
    Then Homepage login butonuna tiklar
    And Admin propertiesten name icin "manSchoolAdmin" ve bilgilerini girer
    And Admin propertiesten password icin "manSchoolAdminPass" ve bilgilerini girer
    But Admin 3 saniye bekler
    And Menu elementine tiklanir
    But Admin 3 saniye bekler
    And Main menuden Dean Manegement secilir
    But Admin 2 saniye bekler
    And Submit butonuna tiklar
    Then zorunlu alan girilmedigi icin name Required mesajini alir
    Then zorunlu alan girilmedigi icin surname Required mesajini alir
    Then zorunlu alan girilmedigi icin birthplace Required mesajini alir
    Then zorunlu alan girilmedigi icin dateofbirth Required mesajini alir
    Then zorunlu alan girilmedigi icin phone Required mesajini alir
    Then zorunlu alan girilmedigi icin ssn Required mesajini alir
    And sayfa kapatilir

