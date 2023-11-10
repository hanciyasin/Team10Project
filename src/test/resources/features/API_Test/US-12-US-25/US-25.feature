@US25_API
Feature: US025 Admin ogrenci olusturabilmeli.

  @US25_API_TC01
  Scenario: TC001 Pozitive Scenario (Post)
    Given Admin olarak Studen eklemek icin post request hazirligi yapilir
    And Gonderilecek studen bilgileri hazirlanir
    When Student eklemek icin post request gonderilir
    Then Student bilgileri dogrulanir
    When Kayitli Student id ile cagirilir
    Then Student bilgileri dogrulanir(get)


  @US25_API_TC02
  Scenario: TC002 Pozitive Scenario(delete)
    Given Studen eklemek icin delete request hazirligi yapilir
    When Student eklemek icin delete request gonderilir
    Then Student bilgileri dogrulanir(delete)