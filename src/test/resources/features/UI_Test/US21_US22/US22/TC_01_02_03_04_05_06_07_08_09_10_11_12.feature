@US22
Feature: US22 Admin ekleme

  Background:
    Given Kullanici Management ON Schools sayfasina gider
    And Login buttonuna tiklar
    And User name kismina admin kayitli kullanici adini girer
    And Password kismina admin kayitli passwordunu girer
    And kullanici Login butonuna tiklar
    And kullanici 2 saniye bekler
    And kullanici Menu butonuna tiklar
    And kullanici acilan Main Menu altindaki Admin Managementa tiklar
    And kullanici 1 saniye bekler

  @US_22_01
  Scenario: TC01 Tüm şartlar sağlandığında Admin ekleme
    Given kullanici Name kutucugunu doldurur
    And kullanici Surname kutucugunu doldurur
    And kullanici Birth Place kutucugunu doldurur
    And kullanici Gender secimini yapar
    And kullanici Date Of Birth girer
    And kullanici Phone kutucugunu doldurur
    And kullanici Ssn kutucugunu doldurur
    And kullanici User Name kutucugunu doldurur
    And kullanici Password kutucugunu doldurur
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici Admin Saved mesajini dogrular
    And kullanici sayfayi kapatir

  @US_22_02
  Scenario: TC02 Name kutucuğu boş bırakıldığında kayıt olunamamalı
    Given kullanici "Name" kutucugunu bos birakir
    And kullanici Surname kutucugunu doldurur
    And kullanici Birth Place kutucugunu doldurur
    And kullanici Gender secimini yapar
    And kullanici Date Of Birth girer
    And kullanici Phone kutucugunu doldurur
    And kullanici Ssn kutucugunu doldurur
    And kullanici User Name kutucugunu doldurur
    And kullanici Password kutucugunu doldurur
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici Required mesajinin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_22_03
  Scenario: TC03 Surname kutucuğu boş bırakıldığında kayıt olunamamalı
    Given kullanici Name kutucugunu doldurur
    And kullanici "Surname" kutucugunu bos birakir
    And kullanici Birth Place kutucugunu doldurur
    And kullanici Gender secimini yapar
    And kullanici Date Of Birth girer
    And kullanici Phone kutucugunu doldurur
    And kullanici Ssn kutucugunu doldurur
    And kullanici User Name kutucugunu doldurur
    And kullanici Password kutucugunu doldurur
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici Required mesajinin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_22_04
  Scenario: TC04 Birth Place kutucuğu boş bırakıldığında kayıt olunamamalı
    Given kullanici Name kutucugunu doldurur
    And kullanici Surname kutucugunu doldurur
    And kullanici "Birth Place" kutucugunu bos birakir
    And kullanici Gender secimini yapar
    And kullanici Date Of Birth girer
    And kullanici Phone kutucugunu doldurur
    And kullanici Ssn kutucugunu doldurur
    And kullanici User Name kutucugunu doldurur
    And kullanici Password kutucugunu doldurur
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici Required mesajinin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_22_05
  Scenario: TC05 Gender seçeneği seçilmediğinde kayıt olunamamalı
    Given kullanici Name kutucugunu doldurur
    And kullanici Surname kutucugunu doldurur
    And kullanici Birth Place kutucugunu doldurur
    And kullanici "Gender" kutucugunu bos birakir
    And kullanici Date Of Birth girer
    And kullanici Phone kutucugunu doldurur
    And kullanici Ssn kutucugunu doldurur
    And kullanici User Name kutucugunu doldurur
    And kullanici Password kutucugunu doldurur
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici sayfayi kapatir

  @US_22_06
  Scenario: TC06 Date Of Birth kutucuğu boş bırakıldığında kayıt olunamamalı
    Given kullanici Name kutucugunu doldurur
    And kullanici Surname kutucugunu doldurur
    And kullanici Birth Place kutucugunu doldurur
    And kullanici Gender secimini yapar
    And kullanici "Date Of Birth" kutucugunu bos birakir
    And kullanici Phone kutucugunu doldurur
    And kullanici Ssn kutucugunu doldurur
    And kullanici User Name kutucugunu doldurur
    And kullanici Password kutucugunu doldurur
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici Required mesajinin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_22_07
  Scenario: TC07 Phone kutucuğu boş bırakıldığında kayıt olunamamalı
    Given kullanici Name kutucugunu doldurur
    And kullanici Surname kutucugunu doldurur
    And kullanici Birth Place kutucugunu doldurur
    And kullanici Gender secimini yapar
    And kullanici Date Of Birth girer
    And kullanici "Phone" kutucugunu bos birakir
    And kullanici Ssn kutucugunu doldurur
    And kullanici User Name kutucugunu doldurur
    And kullanici Password kutucugunu doldurur
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici Required mesajinin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_22_08
  Scenario: TC08 SSN kutucuğu boş bırakıldığında kayıt olunamamalı
    Given kullanici Name kutucugunu doldurur
    And kullanici Surname kutucugunu doldurur
    And kullanici Birth Place kutucugunu doldurur
    And kullanici Gender secimini yapar
    And kullanici Date Of Birth girer
    And kullanici Phone kutucugunu doldurur
    And kullanici "SSN" kutucugunu bos birakir
    And kullanici User Name kutucugunu doldurur
    And kullanici Password kutucugunu doldurur
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici Required mesajinin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_22_09
  Scenario: TC09 SSN kutucuğu - eksik girildiğinde kayıt olunamamalı
    Given kullanici Name kutucugunu doldurur
    And kullanici Surname kutucugunu doldurur
    And kullanici Birth Place kutucugunu doldurur
    And kullanici Gender secimini yapar
    And kullanici Date Of Birth girer
    And kullanici Phone kutucugunu doldurur
    And kullanici "SSN" kutucugunu "-" olmadan girer
    And kullanici User Name kutucugunu doldurur
    And kullanici Password kutucugunu doldurur
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici Minimum 11 character bildiriminin gorundugunu dogrular
    And kullanici sayfayi kapatir

  @US_22_10
  Scenario: TC10 User Name kutucuğu boş bırakıldığında kayıt olunamamalı
    Given kullanici Name kutucugunu doldurur
    And kullanici Surname kutucugunu doldurur
    And kullanici Birth Place kutucugunu doldurur
    And kullanici Gender secimini yapar
    And kullanici Date Of Birth girer
    And kullanici Phone kutucugunu doldurur
    And kullanici Ssn kutucugunu doldurur
    And kullanici "User Name" kutucugunu bos birakir
    And kullanici Password kutucugunu doldurur
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici Required mesajinin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_22_11
  Scenario: TC11 Password kutucuğu boş bırakıldığında kayıt olunamamalı
    Given kullanici Name kutucugunu doldurur
    And kullanici Surname kutucugunu doldurur
    And kullanici Birth Place kutucugunu doldurur
    And kullanici Gender secimini yapar
    And kullanici Date Of Birth girer
    And kullanici Phone kutucugunu doldurur
    And kullanici Ssn kutucugunu doldurur
    And kullanici User Name kutucugunu doldurur
    And kullanici "Password" kutucugunu bos birakir
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici Enter your password mesajinin gozuktugunu dogrular
    And kullanici sayfayi kapatir

  @US_22_12
  Scenario: TC12 Password kutucuğu verilen şartlardan eksik doldurulduğunda kayıt olunamamalı
    Given kullanici Name kutucugunu doldurur
    And kullanici Surname kutucugunu doldurur
    And kullanici Birth Place kutucugunu doldurur
    And kullanici Gender secimini yapar
    And kullanici Date Of Birth girer
    And kullanici Phone kutucugunu doldurur
    And kullanici Ssn kutucugunu doldurur
    And kullanici User Name kutucugunu doldurur
    And kullanici "Password" kutucugunu eksik girer
    And kullanici Admin kaydini tamamlamak icin Submit butonuna tiklar
    And kullanici At least 8 characters mesajinin gozuktugunu dogrular
    And kullanici sayfayi kapatir



