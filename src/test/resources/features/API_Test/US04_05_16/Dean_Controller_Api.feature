@US04_05_API
Feature: Dean Controller

  Scenario: Admin kullanicisi ile Dean hesabi olusturma testi
    Given Dean Save icin URL duzenlenir
    And Dean Save icin payload duzenlenir
    When Dean Save icin POST Request gonderilir ve Reponse alinir
    Then Status kodun 200 oldugu dogrulanir
    And Dean Save icin gelen Response body dogrulanir

  Scenario: Olusturulan Dean hesap bilgisini alma testi
    Given Kayitli Dean hesab bilgisinin ID nosu alinir
    And Dean GetManagerById icin URL duzenlenir
    And Dean GetManagerById icin beklenen veriler duzenlenir
    When Dean GetManagerById icin GET Request gonderilir ve Response alinir
    Then Status kodun 200 oldugu dogrulanir
    And Dean GetManagerById icin gelen Response body dogrulanir

 Scenario: Olusturulan Dean bilgisi guncelleme
   Given Kayitli Dean hesabi icin put request hazirligi yapilir
    And Update edilecek dean bilgileri hazirlanir
    When Kayitli Dean id ile editlenir
    Then Guncel Dean bilgileri dogrulanir

  Scenario: Olusturulmus Dean silme
   Given Kayitli Dean hesabi icin delete request hazirligi yapilir
    When Kayitli Dean hesabi silinir
    Then Status kodun 200 oldugu dogrulanir
    Then Dean hesabi silindigi dogrulanir