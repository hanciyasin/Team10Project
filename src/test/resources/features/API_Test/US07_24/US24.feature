@US24
Feature: Teacher controller
  Scenario: Admin kullanicisi ile teacher olusturma testi
  Given Teacher save icin URL duzenlenir
  And Teacher save icin payload duzenlenir
  When Teacher save icin post request gonderilir ve response alinir
  Then status kodun 200 oldugu dogrulanir
  And Teacher save icin gelen response body dogrulanir

    Scenario: Olusturulan Teacher hesap bilgisi alma testi
      Given Kayıtlı Teacher hesap bilgisinin id nosu alinir
      And Teacher GetSavedTeacherById icin URL duzenlenir
      And Teacher GetSavedTeacherById icin beklenen veriler duzenlenir
      When GetSavedTeacherById icin GET request gonderilir ve Response alinir
      Then status kodun 200 oldugu dogrulanir
      And Teacher GetSavedTeacherById icin gelen response body dogrulanir






