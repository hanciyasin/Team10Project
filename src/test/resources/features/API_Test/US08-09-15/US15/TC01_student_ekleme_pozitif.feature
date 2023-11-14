
@US15
Feature: TC01 Student Ekleme Testi
  Scenario: Student basarili bir sekilde eklenebilmeli
    Given Student eklemek icin Post request hazirligi yapilir
    And Gonderilecek student bilgileri hazirlanir
    When Student eklemek icin Post request gonderilir
    Then Student bilgileri dogrulanir

  Scenario: Olusturulan Student bilgisini alma testi
    Given kayitli student bilgisinden id alınır
    And getStudentById icin URL duzenlenir
    And getStudentById icin beklenen veriler duzenlenir
    When getStudentById icin GET Request gonderilir ve Response alinir

    And getStudentById icin gelen Response body dogrulanir

    Scenario: Eklenen Student silinebilmeli
    When Student delete

