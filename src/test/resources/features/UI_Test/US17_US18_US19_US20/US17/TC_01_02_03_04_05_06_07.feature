@US_17
Feature:US17 Teacher, öğrencilere not verebilmelidir.
  Background:
    Given Teacher managementonschool sayfasina gider
    Then Login butonuna tiklar
    And Teacher olarak kayitli kullanici adini girer
    And Teacher kullanicisi adina kayitli sifreyi girer
    And Password altindaki Login butonuna tiklar
    And Teacher 2 saniye bekler
    And Choose Lesson ddm den bir ders secer
    And Teacher 2 saniye bekler
    And Choose Student ddm den bir ögrenci secer
    And Teacher 2 saniye bekler
    And Choose Education ddm den bir dönem secer
    And Teacher 2 saniye bekler

@US_17_01
 Scenario: TC01 Teacher ogrencilere not verebilmelidir
   Then Teacher absentee alanina 5 sayini girer
   And Teacher Midterm Exam alanina 72 sayisini girer
   And Teacher Final Exam alanina 85 sayisini girer
   And Teacher Info Note alanina "Not Girisi Yapildi" notunu yazar
   And Teacher submit butonuna tiklar
   And Teacher 2 saniye bekler
   And Teacher "Student Info saved Successfully" mesajini gorur
   And Sayfa kapatilir

  @US_17_02
  Scenario: TC02 Midterm Exam notu 0 dan kucuk olmamalidir
    Then Teacher absentee alanina 5 sayini girer
    And Teacher Midterm Exam alanina -1 sayisini girer
    And Teacher Final Exam alanina 85 sayisini girer
    And Teacher Info Note alanina "Not Girisi Yapildi" notunu yazar
    And Teacher 1 saniye bekler
    And Teacher submit butonuna tiklar
    And Teacher 1 saniye bekler
    And Teacher "'0.0' değerinden büyük yada eşit olmalı" mesajini alir
    And Teacher 3 saniye bekler
    And Sayfa kapatilir

  @US_17_03
  Scenario: TC03 Midterm Exam notu 100 den buyuk olmamalidir
    Then Teacher absentee alanina 5 sayini girer
    And Teacher Midterm Exam alanina 101 sayisini girer
    And Teacher Final Exam alanina 85 sayisini girer
    And Teacher Info Note alanina "Not Girisi Yapildi" notunu yazar
    And Teacher 1 saniye bekler
    And Teacher submit butonuna tiklar
    And Teacher 1 saniye bekler
    And Teacher "'100.0' değerinden küçük yada eşit olmalı" mesajini alir
    And Sayfa kapatilir

  @US_17_04
  Scenario: TC04 Final Exam notu 0 dan kucuk olmamalidir
    Then Teacher absentee alanina 5 sayini girer
    And Teacher Midterm Exam alanina 72 sayisini girer
    And Teacher Final Exam alanina -1 sayisini girer
    And Teacher Info Note alanina "Not Girisi Yapildi" notunu yazar
    And Teacher 1 saniye bekler
    And Teacher submit butonuna tiklar
    And Teacher 1 saniye bekler
    And Teacher "'0.0' değerinden büyük yada eşit olmalı" mesajini alir
    And Sayfa kapatilir

  @US_17_05
   Scenario: TC05 Final Exam notu 100 den buyuk olmamalidir
     Then Teacher absentee alanina 5 sayini girer
     And Teacher Midterm Exam alanina 72 sayisini girer
     And Teacher Final Exam alanina 101 sayisini girer
     And Teacher Info Note alanina "Not Girisi Yapildi" notunu yazar
     And Teacher 1 saniye bekler
     And Teacher submit butonuna tiklar
     And Teacher 1 saniye bekler
     And Teacher "'100.0' değerinden küçük yada eşit olmalı" mesajini alir
     And Sayfa kapatilir

  @US_17_06
  Scenario: TC06 Öğrenci hakkinda girilen Info notu en az 10 karakter icermelidir
    Then Teacher absentee alanina 5 sayini girer
    And Teacher Midterm Exam alanina 72 sayisini girer
    And Teacher Final Exam alanina 85 sayisini girer
    And Teacher Info Note alanina "NotGirisi" notunu yazar
    And Teacher 1 saniye bekler
    And Teacher submit butonuna tiklar
    And Teacher 1 saniye bekler
    And Teacher "Info should be at least 10 characters" mesajini alir
    And Sayfa kapatilir

  @US_17_07
  Scenario: TC07 ogrenci hakkinda girilen Info notu harf, rakam ve ozel karakter icerebilmelidir.
    Then Teacher absentee alanina 5 sayini girer
    And Teacher Midterm Exam alanina 72 sayisini girer
    And Teacher Final Exam alanina 85 sayisini girer
    And Teacher Info Note alanina "Not Girisi Yapildi123*" notunu yazar
    And Teacher 1 saniye bekler
    And Teacher submit butonuna tiklar
    And Teacher 1 saniye bekler
    And Teacher "Student Info saved Successfully" mesajini gorur
    And Sayfa kapatilir




