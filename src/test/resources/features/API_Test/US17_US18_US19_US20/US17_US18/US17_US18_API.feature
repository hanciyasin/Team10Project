@APIGLCN
Feature: Student_Info_Management
  Scenario: Teacher kullanicisi ile not verme testi
    Given Not verme icin URL duzenlenir
      And Not verme icin payload duzenlenir
      When Not verme icin POST Request gonderilir ve Reponse alinir
    # Then Status kodun 200 oldugu dogrulanir
      And Not verme icin gelen Response body dogrulanir


  Scenario: Teacher kullanicisi verdigi notlari gorebilir testi
    Given StudentInfoGetID icin URL duzenlenir
    And StudentInfoGetID icin beklenen veriler olusturulur
    When StudentInfoGetID icin POST Request gonderilir ve Reponse alinir
    Then Status kodun 200 oldugu dogrulanir
    And Verilen notlarin goruldugu dogrulanir



#Scenario: Teacher kullanicisinin verdigi notu guncelleyebilmesi testi
#  Given Not guncelleme icin URL düzenlenir
#    And Not guncelleme icin payload duzenlenir
#    When Not guncelleme icin POST Request gonderilir ve Reponse alinir
#    #And Not guncelleme icin gelen Response body dogrulanir