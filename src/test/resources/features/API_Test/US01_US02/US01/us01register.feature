 @US01_API
Feature: Register
Scenario: register etkisiyle Aday öğrenci öğrenci  oluşturma  testi
  Given REGİSTER icin URL duzenlenir
  And REGİSTER icin payload duzenlenir
  When REGİSTER POST Request gonderilir ve Reponse alinir
  Then Status kodun 200 oldugu dogrulanir.
  And REGİSTER icin gelen Response body dogrulanir


  Scenario: Olusturulan  bilgileri görebilme (get)
    Given Kayitli guestuser hesabi icin id  bilgisi alınır
     And oluşturulan bu id için  url  düzenlenir
    When Kayitli guestuser id ile ilgili  beklenen  veriler  düzenlenir
    Then guesrtser için  get reguest  gönderilir  response  alınır
    And guest  userin  respons u  dogrulanır

  Scenario: Olusturulmus guestuser i silme
    Given Kayitli guestuser hesabi icin Delete icin URL duzenlenir
    When Kayitli guestuser hesabi Delete icin DELETE Request gonderilir ve Response alinir
