@US17_18_DB
Feature: StudentInfo Bilgisi Dogrulama
  Scenario: Kayıtlı StudentInfo bilgisini dogrulama
    Given StudentInfo Database baglantisi kurulur
    And StudentInfo icin beklenen veriler duzenlenir
    When Kayitli StudentInfo bilgisini almak icin Query gonderilir
    Then Kayitli StudentInfo bilgisi dogrulanir
    And StudentInfo Database baglantisi kesilir