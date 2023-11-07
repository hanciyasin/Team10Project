@US_11
Feature: US11 Vice Dean ders programını görebilmeli ve güncellemeler yapabilmelidir.

  Background:
    Given Kullanici Managementon Schools sayfasina gider
    Then Kullanici login butonuna tiklar
    Then Kullanici propertiesten username olarak "viceDeanUser" bilgisini girer
    Then Kullanici propertiesten password olarak "viceDeanPass" bilgisini girer
    Then Kullanici inLogin butonuna tiklar
    Then Kullanici Menu butonuna tiklar
    Then Kullanici acilan Main Menu'den Lesson Managament butonuna tiklar
    Then Kullanici acilan sayfada Lesson Program sekmesine tiklar
    And Kullanici 2 saniye bekler

  @US_11_01
  Scenario: TC01 "Lesson Program List" görebilmelidir.
    Given Kullanicinin Lesson Program List gorebildigi kontrol edilir
    And Kullanici Logout yapar

  @US_11_02
  Scenario: TC02 "Lesson Program List" ten Oluşturulan "Lesson" görebilmelidir.
    Given Kullanicinin Lesson Program Listte Lesson bilgisini gorebildigi dogrulanir
    And Kullanici Logout yapar

  @US_11_03
  Scenario: TC03 "Lesson Program List" ten Oluşturulan "Day" görebilmelidir.
    Given Kullanicinin Lesson Program Listte Day bilgisini gorebildigi dogrulanir
    And Kullanici Logout yapar

  @US_11_04
  Scenario: TC04 "Lesson Program List" ten Oluşturulan "Start Time" görebilmelidir.
    Given Kullanicinin Lesson Program Listte Start Time bilgisini gorebildigi dogrulanir
    And Kullanici Logout yapar

  @US_11_05
  Scenario: TC05 "Lesson Program List" ten Oluşturulan "Stop Time" görebilmelidir.
    Given Kullanicinin Lesson Program Listte Stop Time bilgisini gorebildigi dogrulanir
    And Kullanici Logout yapar
    And sayfa kapatilir





