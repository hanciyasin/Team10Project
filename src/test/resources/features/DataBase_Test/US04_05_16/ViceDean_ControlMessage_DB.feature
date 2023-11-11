@US16_DB
Feature: Vice Dean Mesajlari gorebilmeli
  Scenario: Vice Dean gelen mesajlari gorebilmeli
    And Beklenen veriler duzenlenir
    When Kayitli Vice Dean hesap bilgisini almak icin Query gonderilir
    Then Gonderilen mesaj bilgileri dogrulanir
