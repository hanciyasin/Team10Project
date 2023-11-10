 @US01_API
Feature: Register
Scenario: Aday öğrenci  kayıt  testi
  Given REGİSTER icin URL duzenlenir
  And REGİSTER icin payload duzenlenir
  When REGİSTER POST Request gonderilir ve Reponse alinir
  Then Status kodun 401 oldugu dogrulanir.
  And REGİSTER icin gelen Response body dogrulanir
