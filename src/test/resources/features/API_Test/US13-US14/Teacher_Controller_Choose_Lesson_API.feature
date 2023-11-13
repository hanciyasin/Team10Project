@API_LESSON
Feature: Choose Lesson
  Scenario: Vice Dean olarak teacher icin lesson olusturma testi
    Given Ders secimi icin URL duzenlenir
    Then Ders icin payload duzenlenir
    When Ders kaydi icin Post request gonderilir ve response alinir
    Then Ders status codunun 200 oldugu dogrulanir
    And  response body dogrulanir
