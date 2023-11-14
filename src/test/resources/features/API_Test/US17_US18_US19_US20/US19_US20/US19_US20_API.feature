@APIGLCN_US19_US20
Feature: Student_Info_Management Meet Management
  Scenario: Teacher kullanicisi ile meet olusturma testi
    Given Meet olusturma icin URL duzenlenir
    And Meet olusturma icin payload duzenlenir
    When Meet olusturma icin POST Request gonderilir ve Reponse alinir
    Then Gelen Status kodun 200 oldugu dogrulanir
    And Meet olusturma icin gelen Response body dogrulanir

# Scenario: GetMeet testi
#   Given GetMeetID icin URL duzenlenir
#   And GetMeetID icin beklenen veriler olusturulur
#   When GetMeetID icin POST Request gonderilir ve Reponse alinir
#   Then Gelen Status kodun 200 oldugu dogrulanir
#   And Verilen randevunun goruldugu dogrulanir

Scenario: Teacher in olusturulan meet i guncelleyebilmesi testi
  Given Meet guncelleme icin URL düzenlenir
  And Meet guncelleme icin payload duzenlenir
  When Meet guncelleme icin POST Request gonderilir ve Reponse alinir
  Then Gelen Status kodun 200 oldugu dogrulanir
  And Meet guncelleme icin gelen Response body dogrulanir


  Scenario: Teacher kullanicisi meet i silebilir
    Given Meet silme icin URL düzenlenir
    And Meet silme icin beklenen veriler olusturulur
    When Meet silme icin POST Request gonderilir ve Reponse alinir
    Then Gelen Status kodun 200 oldugu dogrulanir
    And Meet silme icin gelen Response body dogrulanir