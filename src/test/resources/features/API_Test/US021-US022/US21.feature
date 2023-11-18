@US21
Feature: Students, choose lesson, grades and announcement


  Scenario: Öğrenci Choose Lesson listesinde; Teacher, Day, Start Time ve Stop Time bilgilerini görebilmeli
    Given Student yetkisiyle giris yapilir
    And getAll lesson program by student icin URL duzenlenir
    And getAll lesson program by student icin beklenen veriler duzenlenir
    When getAll lesson program by student icin get request gonderilir response alinir
    Then Status kodun 200 oldugu dogrulanirrr
    And getAll lesson program by student icin get request icin gelen response body dogrulanir

  Scenario: İstediğin ders veya dersleri seçebilmeli
    Given Student yetkisiyle giris yapilir
    And Choose Lesson icin URL duzenlenir
    And Choose Lesson icin payLoad duzenlenir
    When Choose Lesson icin post request gonderilir response alinir
    Then Status kodun 200 oldugu dogrulanirrr
    And Choose Lessson icin body dogrulanir





