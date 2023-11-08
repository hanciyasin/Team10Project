@API
  Feature: Leeson Controller

    Scenario: Vice Dean Ders ekleme
      Given lesson save icin url duzenlenir
      And lesson save icin payload duzenlenir
      When lesson save icin POST Request gonderilir Response alinir
      Then Status kodun 200 oldugu dogrulanır
      And lesson save icin gelen Response dogrulanir




