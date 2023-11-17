@US22_API
Feature: Admin girisiyle admin eklenebilmeli


  Scenario: Admin kullanicisi ile admin hesabi olusturulabilmeli
  Given Admin yetkisiyle giris yapilir
    And Admin save icin URL düzenlenir
    And Admin save icin payload düzenlenir
    When Admin save icin POST request gonderilir ve response alinir
    Then Status kodun 200 oldugu dogrulanirr
    And Admin save icin gelen response body dogrulanir




  Scenario: Olusturulan admin hesap bilgisini alma
    Given Kayitli admin hesap bilgisinin id numarasi alinir ve URL duzenlenir
    And Admin get icin beklenen veriler duzenlenir
    Then Status kodun 200 oldugu dogrulanirr
    And Admin get icin gelen response body dogrulanir


  Scenario: Olusturulan admin hesap bilgisini silme
    Given Admin DELETE icin URL duzenlenir
    When Admin DELETE icin DELETE Request gonderilir ve response alinir
    Then Status kodun 200 oldugu dogrulanirr
    And Admin DELETE icin gelen response body dogrulanir