@US_03_E2E
Feature: US03 Kullanıcılar sayfadan mesaj gönderebilmelidir. E2E TEST

  Background:
    Given Kullanici Managementon Schools sayfasina gider
    Then Kullanici contact butonuna tiklar

  Scenario: TC01 Kulllanıcı mesajını gönderebilmelidir..
    Then Kullanici name bilgisi girer
    Then Kullanici email bilgisi girer
    Then Kullanici subject bilgisi girer
    Then Kullanici message kutusuna mesajini girer
    And Kullanici 2 saniye bekler
    Then Kullanici send message butonuna tiklar
    And 'Contact Message Created Sucessfully' mesaji alir

  Scenario: Pozitif Contact Message Test
    Given Contact Message icin Url hazirlanir
    Then Contact Message icin payload olusturulur "<email>" "<message>" "<name>" "<subject>"
    When Contact Message icin Post request gonderilir
    And Gelen response ile dogrulama yapilir

  Scenario: Contact Message Test
    Given Database baglantisi olusturulur
    Then Database'e gondermek icin payload olusturulur
    Then Gonderilen mesaji almak icin query olusturulur
    And Gonderilen ile Database'deki mesajin dogrulamasi yapilir