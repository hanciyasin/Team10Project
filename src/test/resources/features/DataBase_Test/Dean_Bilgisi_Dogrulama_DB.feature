@US04_DB
Feature: Dean Bilgisi Dogrulama
  Scenario: Kayıtlı Dean bilgisini dogrulama
    Given Database baglantisi kurulur
    And Dean icin beklenen veriler duzenlenir
    When Kayitli Dean hesab bilgisini almak icin Query gonderilir
    Then Kayitli Dean bilgisi dogrulanir
    And Database baglantisi kesilir