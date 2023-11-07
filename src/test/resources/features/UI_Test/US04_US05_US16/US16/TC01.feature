@US16
Feature: ManagementSchool UI Test

  @US16_01
  Scenario: TC01 Vice Dean mesajlarin Name,Email,Date,Subject,Message bilgilerini gorebilmeli
    Given admin management school sayfasina gider
    Then Homepage login butonuna tiklar
    And Admin propertiesten name icin "viceDeanNameDD" ve bilgilerini girer
    And Admin propertiesten password icin "manSchoolAdminPass" ve bilgilerini girer
    But Admin 3 saniye bekler
    And Menu elementine tiklanir
    But Admin 2 saniye bekler
    And Main menuden Contact Get All secilir
    Then name bilgisi gorunur
    Then email bilgisi gorunur
    Then date bilgisi gorunur
    Then subject bilgisi gorunur
    Then message bilgisi gorunur
    And sayfa kapatilir