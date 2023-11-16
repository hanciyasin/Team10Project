@API_TC01
Feature: Vice Dean Ogretmen olusturma

  Scenario: US13-API  Vice Dean Teacher i basarili bir sekilde ekleyebilmeli
    Given Teacher eklemek icin Post request hazirligi yapilir.
    And Gonderilecek Teacher bilgileri hazirlanir.
    When Teacher eklemek icin Post request gonderilir.
    Then Teacher bilgileri dogrulanir.
    #Then kullanici olusturulan Teacheri update eder
    #Then kullanici olusturulan Teacheri siler.
  @API_TC02
  Scenario: Olusturulan Teacher bilgisini alma testi
    Given Kayitli teacher bilgisinin Id No'su alinir
    Then getSavedTeacher By Id icin url duzenlenir
    Then getSavedTeacher By Id icin beklenen veriler duzenlenir
    When GetSavedTeacherById icin GET request gonderilir Response al.
    And  Status code dogrulanir
    And Teacher save icin gelen data dogrulanir
