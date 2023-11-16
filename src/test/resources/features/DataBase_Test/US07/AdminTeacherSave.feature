Feature: Teacher Bilgisi Dogrulama
  Scenario: Kayıtlı Teacher bilgisini dogrulama
    Given Database baglantisi kurulur.
    And Teacher icin beklenen veriler duzenlenir
    When Kayitli Teacher hesab bilgisini almak icin Query gonderilir
    Then Kayitli Teacher bilgisi dogrulanir
    And Database baglantisi kesilir.