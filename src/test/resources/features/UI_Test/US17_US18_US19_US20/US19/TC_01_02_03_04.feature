@US_19
Feature: US19 Teacher ogrenciler ile toplanti duzenleyebilmelidir
 Background:
   Given Teacher managementonschool sayfasina gider
   Then Login butonuna tiklar
   And Teacher olarak kayitli kullanici adini girer
   And Teacher kullanicisi adina kayitli sifreyi girer
   And Password altindaki Login butonuna tiklar
   And Teacher 2 saniye bekler
   And Teacher sol ust kosedeki Menu butonuna tiklar
   And Teacher 1 saniye bekler
   And Teacher acilan main menu listesinden Meet Management secenegine tiklar
   And Teacher 1 saniye bekler
   And Teacher Choose Student ddm den bir ogrenci secer
   And Teacher 1 saniye bekler

 @US_19_01
 Scenario: TC01 Teacher ogrenciler ile toplanti duzenleyebilmeli
   Then Teacher Date Of Meet alanina "30112023" tarihini girer
   And Teacher Start Time alanina "1400" saatini girer
   And Teacher Stop Time alanina "1430" saatini girer
   And Teacher description alanına "Randevu" aciklamasini girer
   And Teacher meet submit butonuna tiklar
   And Teacher 2 saniye bekler
   And Teacher kayit yapildigini gorur
   And Teacher 2 saniye bekler
   And Sayfa kapatilir

@US_19_02
 Scenario: TC02 Toplantı tarihi gecmis bir tarih secilememeli
   Then Teacher Date Of Meet alanina "30092023" tarihini girer
   And Teacher Start Time alanina "1400" saatini girer
   And Teacher Stop Time alanina "1430" saatini girer
   And Teacher description alanına "Randevu" aciklamasini girer
   And Teacher 1 saniye bekler
   And Teacher meet submit butonuna tiklar
   And Teacher 2 saniye bekler
   And Teacher kayit yapilmadigini gorur
   And Teacher 1 saniye bekler
   And Sayfa kapatilir

@US_19_03
  Scenario: TC03 Start Time Stop Time dan once olmali
    Then Teacher Date Of Meet alanina "30112023" tarihini girer
    And Teacher Start Time alanina "1430" saatini girer
    And Teacher Stop Time alanina "1400" saatini girer
    And Teacher description alanına "Randevu" aciklamasini girer
    And Teacher meet submit butonuna tiklar
    And Teacher 1 saniye bekler
    And Teacher kayit yapilmadigini gorur
    And Teacher 1 saniye bekler
    And Sayfa kapatilir

@US_19_04
  Scenario: TC04 Teacher ayni gun ve saate randevu verememeli
    Then Teacher Date Of Meet alanina "30112023" tarihini girer
    And Teacher Start Time alanina "1400" saatini girer
    And Teacher Stop Time alanina "1430" saatini girer
    And Teacher description alanına "Randevu" aciklamasini girer
    And Teacher meet submit butonuna tiklar yeni
    And Teacher 1 saniye bekler
    And Teacher Date Of Meet alanina "30112023" tarihini girer
    And Teacher Start Time alanina "1400" saatini girer
    And Teacher Stop Time alanina "1430" saatini girer
    And Teacher description alanına "Randevu" aciklamasini girer
    And Teacher meet submit butonuna tiklar
    And Teacher 1 saniye bekler
    #And Teacher "Error: Meet schedule cannot be selected for the same hour and day" mesajini gorur
    And Teacher 1 saniye bekler
    And Sayfa kapatilir




