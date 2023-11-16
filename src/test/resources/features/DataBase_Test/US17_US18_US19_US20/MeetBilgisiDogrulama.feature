@US19_20_DB
Feature: StudentInfo Bilgisi Dogrulama
  Scenario: Kayıtlı Meet bilgisini dogrulama
    Given Meet Database baglantisi kurulur
    And Meet icin beklenen veriler duzenlenir
    When Kayitli Meet bilgisini almak icin Query gonderilir
    Then Kayitli Meet bilgisi dogrulanir
    And Meet Database baglantisi kesilir