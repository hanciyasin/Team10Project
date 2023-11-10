@APIGLCN
Feature: Student_Info_Management
  Scenario: Teacher kullanicisi ile not verme testi
    Given Not verme icin URL duzenlenir
    And Not verme icin payload duzenlenir
    When Not verme icin POST Request gonderilir ve Reponse alinir
   # Then Status kodun 200 oldugu dogrulanir
    And Not verme icin gelen Response body dogrulanir



  Scenario: Teacher verdigi notu gorur
    #Given Kayitli ogrenci not bilgisinin ID nosu alinir
    And GetByStudentId icin URL duzenlenir
#   And GetByStudentId icin beklenen veriler duzenlenir
#   When GetByStudentId icin POST Request gonderilir ve Reponse alinir
#   Then Status kodun 200 oldugu dogrulanir
#   And GetByStudentId icin gelen response body dogrulanir