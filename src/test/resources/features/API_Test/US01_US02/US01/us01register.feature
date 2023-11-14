 @US01_API
Feature: Register
Scenario: Aday öğrenci  kayıt  testi
  Given REGİSTER icin URL duzenlenir
  And REGİSTER icin payload duzenlenir
  When REGİSTER POST Request gonderilir ve Reponse alinir
  Then Status kodun 200 oldugu dogrulanir.
  And REGİSTER icin gelen Response body dogrulanir


  Scenario: Olusturulan reg bilgisi guncelleme.
    Given Kayitli Dean hesabi icin put request hazirligi yapilir.
    And Update edilecek dean bilgileri hazirlanir
    When Kayitli Dean id ile editlenir
    Then Guncel Dean bilgileri dogrulanir

  Scenario: Olusturulmus Dean silme
    Given Kayitli Dean hesabi icin delete request hazirligi yapilir
    When Kayitli Dean hesabi silinir
    Then Status kodun 200 oldugu dogrulanir
    Then Dean hesabi silindigi dogrulanir