@US_18
Feature: US18 Teacher, ogrenciye verdigi notlari, gorebilmeli ve guncelleyebilmeli ve silebilmelidir.
  Background:
    Given Teacher managementonschool sayfasina gider
    Then Login butonuna tiklar
    And Teacher olarak kayitli kullanici adini girer
    And Teacher kullanicisi adina kayitli sifreyi girer
    And Password altindaki Login butonuna tiklar
    And Teacher 1 saniye bekler
    And Choose Lesson ddm den bir ders secer
    And Teacher 1 saniye bekler
    And Choose Student ddm den bir ögrenci secer
    And Teacher 1 saniye bekler
    And Choose Education ddm den bir dönem secer
    And Teacher 1 saniye bekler
    And Teacher absentee alanina 5 sayini girer
    And Teacher Midterm Exam alanina 72 sayisini girer
    And Teacher Final Exam alanina 85 sayisini girer
    And Teacher Info Note alanina "Not Girisi Yapildi" notunu yazar
    And Teacher submit butonuna tiklar
    And Teacher 1 saniye bekler

  @US_18_01
  Scenario: TC01 Teacher, öğrenciye verdiği notları görebilmelidir
    Then Teacher eklenen ogrencinin midterm exam notunu gorur
    And Teacher eklenen ogrencinin final exam notunu gorur
    And Sayfa kapatilir

  @US_18_02
  Scenario: TC02 Teacher, Absentee, Midterm Exam, Final Exam ve Info Note u guncelleyebilmelidir.
    Then Teacher listedeki ilk satir sonundaki edit butonuna basar
    And Teacher Absentee' değerini 7 ile değiştir
    And Teacher Midterm Exam değerini 90 ile değiştir
    And Teacher Final Exam değerini 100 ile değiştirir
    And Teacher Info Note kısmını 'NotGüncellendi' olarak değiştir
    And Teacher edit submit butonuna tiklar
    And Teacher 1 saniye bekler
    And Teacher "Student Info updated Successfully" mesajini gorur
    And Sayfa kapatilir

  @US_18_03
  Scenario: TC03 Teacher, öğrenciye verdiği notları silebilmelidir.
    Then Teacher listedeki ilk satir sonundaki kırmızı cop kutusu ikonuna tiklar
    And Teacher 1 saniye bekler
    And Teacher ogrenciye verdiği notu silebilmeli
    And Sayfa kapatilir





