Feature: US_03 CONTACT MESSAGE DATABASE TEST
  Scenario: Contact Message Test
    Given Database baglantisi olusturulur
    Then Database'e gondermek icin payload olusturulur
    Then Gonderilen mesaji almak icin query olusturulur
    And Gonderilen ile Database'deki mesajin dogrulamasi yapilir


