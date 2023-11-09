@API_TC01
  Feature: Teachers Controller
    Scenario: Vice Dean olarak teacher olusturma testi
      Given Teacher kaydetmek icin URL duzenlenir
      Then Teacher kaydi icin payload duzenlenir
      When Teacher kaydi icin Post request gonderilir ve response alinir
      Then status codun 200 oldugu dogrulanir
      And Teacher kaydi icin gelen response body dogrulanir

