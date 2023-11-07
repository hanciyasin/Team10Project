@US_20
Feature: US20 Teacher, toplantıları görebilmeli, güncelleyebilmeli ve silebilmelidir.
Background:
  Given Teacher managementonschool sayfasina gider
  Then Login butonuna tiklar
  And Teacher olarak kayitli kullanici adini girer
  And Teacher kullanicisi adina kayitli sifreyi girer
  And Password altindaki Login butonuna tiklar
  And Teacher 1 saniye bekler
  And Teacher sol ust kosedeki Menu butonuna tiklar
  And Teacher 1 saniye bekler
  And Teacher acilan main menu listesinden Meet Management secenegine tiklar
  And Teacher 1 saniye bekler
  And Teacher Choose Student ddm den bir ogrenci secer
  And Teacher 1 saniye bekler
  And Teacher Date Of Meet alanina "30112023" tarihini girer
  And Teacher Start Time alanina "1400" saatini girer
  And Teacher Stop Time alanina "1430" saatini girer
  And Teacher description alanına "Randevu" aciklamasini girer
  And Teacher meet submit butonuna tiklar yeni
  And Teacher 1 saniye bekler

@US_20_01
  Scenario: TC01 Teacher, toplantilari gorebilmeli.
    Then Teacher olusturulan toplanti listesini gorur
    And Sayfa kapatilir

@US_20_02
  Scenario: TC02  Teacher, toplantı yapacağı kişiyi güncelleyebilmeli
    Then Teacher listedeki ilk satir sonundaki edit butonuna basar
    And Teacher 2 saniye bekler
    And Teacher Students ddm menuden yeni bir ogrenci secer
    And Teacher 2 saniye bekler
    And Teacher meet edit submit butonuna tiklar yeni
    And Teacher 2 saniye bekler
    And Teacher "Meet Updated Successfully" mesajini gorur
    And Teacher 2 saniye bekler
    And Sayfa kapatilir

@US_20_03
   Scenario: TC03 Teacher, toplanti yapacagi tarihi guncelleyebilmeli
     Then Teacher listedeki ilk satir sonundaki edit butonuna basar
     And Teacher 2 saniye bekler
     And Teacher Date of Meet alanina yeni bir "01122023" tarih girer
     And Teacher 2 saniye bekler
     And Teacher meet edit submit butonuna tiklar yeni
     And Teacher 2 saniye bekler
     And Teacher "Meet Updated Successfully" mesajini gorur
     And Teacher 2 saniye bekler
     And Sayfa kapatilir

@US_20_05
   Scenario: TC05  Teacher, toplantinin description kismini guncelleyebilmeli
     Then Teacher listedeki ilk satir sonundaki edit butonuna basar
     And Teacher 2 saniye bekler
     And Teacher Description kısmına yeni bir metin olarak "2" girer
     And Teacher 2 saniye bekler
     And Teacher meet edit submit butonuna tiklar yeni
     And Teacher 2 saniye bekler
     And Teacher "Meet Updated Successfully" mesajini gorur
     And Teacher 2 saniye bekler
     And Sayfa kapatilir

@US_20_06
   Scenario: TC06 Teacher, toplantıyı silebilmeli
  Then Teacher 2 saniye bekler
     Then Teacher listedeki ilk satir sonundaki kirmizi cop kutusu ikonuna basar
     And Teacher 1 saniye bekler
     And Teacher meet in silindigini gorur
     And Teacher 1 saniye bekler
     And Sayfa kapatilir






