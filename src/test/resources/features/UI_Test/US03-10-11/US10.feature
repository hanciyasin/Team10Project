@US_10
Feature: US10 Vice Dean ders programı oluşturabilmelidir.
  Background:
    Given Kullanici Managementon Schools sayfasina gider
    Then Kullanici login butonuna tiklar
    Then Kullanici propertiesten username olarak "viceDeanUser" bilgisini girer
    Then Kullanici propertiesten password olarak "viceDeanPass" bilgisini girer
    Then Kullanici inLogin butonuna tiklar
    Then Kullanici Menu butonuna tiklar
    Then Kullanici acilan Main Menu'den Lesson Managament butonuna tiklar
    Then Kullanici acilan sayfada Lesson Program sekmesine tiklar

  @US_10_01
  Scenario: TC01 Vice Dean ders programı oluşturabilmelidir. (Lesson Program - Add Lesson Program)
    Given Kullanici Choose Lesson kismindan ders secer
    Then Kullanici Choose Day kismindan gun secer
    Then Kullanici Choose Education Term kismindan donem secer
    Then Kullanici Start Time kismindan baslangic zamanini secer
    Then Kullanici Stop Time kismindan bitis zamanini secer
    Then Kullanici Submit butonuna tiklar
    And Kullanici 'Created Lesson Program' mesajini alir
    And Kullanici Logout yapar

  @US_10_02
  Scenario: TC02 Ders seçebilmelidir.
    Given Kullanici Choose Lesson kismindan ders secer
    Then Kullanicinin ders secebildigi kontrol edilir
    And Kullanici Logout yapar

  @US_10_03
  Scenario: TC03 Eğitim dönemi seçebilmelidir.
    Given Kullanici Choose Education Term kismindan donem secer
    Then Kullanicinin donem secebildigi kontrol edilir
    And Kullanici Logout yapar

  @US_10_04
  Scenario: TC04 Ders için gün seçebilmelidir.
    Given Kullanici Choose Day kismindan gun secer
    Then  Kullanicinin gun secebildigi kontrol edilir
    And Kullanici Logout yapar

  @US_10_05
  Scenario: TC05 Ders için başlama saati seçebilmelidir.
    Given Kullanici Start Time kismindan baslangic zamanini secer
    Then Kullanicinin baslangic zamanini secebildigi kontrol edilir
    And Kullanici Logout yapar

  @US_10_06
  Scenario: TC06 Ders için bitiş saati seçebilmelidir.
    Given Kullanici Stop Time kismindan bitis zamanini secer
    Then Kullanicinin bitis zamanini secebildigi kontrol edilir
    And Kullanici Logout yapar
    And sayfa kapatilir