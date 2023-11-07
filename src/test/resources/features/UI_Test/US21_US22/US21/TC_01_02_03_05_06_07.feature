@US21
Feature: US21 Students, choose lesson, grades and announcement

  Background:
    Given Kullanici Management ON Schools sayfasina gider
    And Login buttonuna tiklar
    And User name kismina kayitli ogrenci kullanici adini girer
    And Password kismina kayitli ogrenci passwordunu girer
    And kullanici Login butonuna tiklar
    And kullanici 1 saniye bekler

  @US_21_01
  Scenario: TC01 Öğrenci Choose Lesson listesinde; Teacher, Day, Start Time ve Stop Time bilgilerini görebilmeli
    Given kullanici Menu butonuna tiklar
    And kullanici acilan Main Menu altindaki Choose Lessona tiklar
    And kullanici Choose Lesson listesinde bulunan Teacher, Day, Start Time ve Stop Time bilgilerinin gorunurlugunu dogrular
    And kullanici sayfayi kapatir

  @US_21_02
  Scenario: TC02 İstediğin ders veya dersleri seçebilmeli
    Given kullanici Menu butonuna tiklar
    And kullanici acilan Main Menu altindaki Choose Lessona tiklar
    And kullanici Choose Lesson listesinden kutucuga tiklayarak ders secer
    And kullanici sayfayi submit butonuna kadar kaydirir
    And kullanici Submit buttonuna tiklar
    And kullanici Lesson added to Student bildiriminin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_21_03
  Scenario: TC03 Aynı gün ve saate denk gelen dersleri seçememeli
    Given kullanici Menu butonuna tiklar
    And kullanici acilan Main Menu altindaki Choose Lessona tiklar
    And kullanici Choose Lesson listesinde; Choose Lesson kısmından kutucuklara tıklayarak aynı gün ve aynı saatte olan derslerden 2 ders seçimi yapar
    And kullanici sayfayi submit butonuna kadar kaydirir
    And kullanici Submit buttonuna tiklar
    And kullanici Error: Course schedule cannot be selected for the same hour and day bildiriminin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_21_05
  Scenario: TC05 Seçtiği dersleri Lesson Program List’te görebilmeli
    Given kullanici Menu butonuna tiklar
    And kullanici acilan Main Menu altindaki Choose Lessona tiklar
    And kullanici sayfayi onceden sectigi derse kaydirir
    And kullanici onceden sectigi "Coding2" dersin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_21_06
  Scenario: TC06 Öğrenci sınav notlarını görebilmeli
    Given kullanici Menu butonuna tiklar
    And kullanici acilan Main Menu altindaki Grades and Announcements tiklar
    And kullanici "Coding1" dersinin sınav notlarinin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_21_07
  Scenario: TC07 Öğrenci, danışmanın kendisi için oluşturduğu toplantıları görebilmeli
    Given kullanici Menu butonuna tiklar
    And kullanici acilan Main Menu altindaki Grades and Announcements tiklar
    And kullanici onceden olusturulan toplanti bilgilerinin gozuktugunu dogrular
    And kullanici sayfayi kapatir
