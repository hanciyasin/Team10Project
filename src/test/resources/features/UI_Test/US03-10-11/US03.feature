@US_03
Feature: US03 Kullanıcılar sayfadan mesaj gönderebilmelidir. (Contact)

  Background:
    Given Kullanici Managementon Schools sayfasina gider
    Then Kullanici contact butonuna tiklar

  @US_03_01
  Scenario: TC01 Kulllanıcı mesajını gönderebilmelidir..
    Then Kullanici name bilgisi girer
    Then Kullanici email bilgisi girer
    Then Kullanici subject bilgisi girer
    Then Kullanici message kutusuna mesajini girer
    And Kullanici 2 saniye bekler
    Then Kullanici send message butonuna tiklar
    And 'Contact Message Created Sucessfully' mesaji alir

  @US_03_02
  Scenario: TC02 Herhangi bir karakter içeren ve boş bırakılamayan "Name" girmelidir.
    Given Kullanici Managementon Schools sayfasina gider
    Then Kullanici contact butonuna tiklar
    Then Kullanici name bilgisini bos birakir
    Then Kullanici email bilgisi girer
    Then Kullanici subject bilgisi girer
    Then Kullanici message kutusuna mesajini girer
    And Kullanici 2 saniye bekler
    Then Kullanici send message butonuna tiklar
    And Required uyarisi alir

  @US_03_03
  Scenario: TC03 Kullanıcı e-mail adresini girmelidir. Email adresinde "@" karakteri olmalıdır.
    Given Kullanici Managementon Schools sayfasina gider
    Then Kullanici contact butonuna tiklar
    Then Kullanici name bilgisi girer
    Then Kullanici email bilgisini '@' karakteri eksik girer
    Then Kullanici subject bilgisi girer
    Then Kullanici message kutusuna mesajini girer
    And Kullanici 2 saniye bekler
    Then Kullanici send message butonuna tiklar
    And 'Please enter valid email' uyarisi alir

  @US_03_05
  Scenario: TC05 Kullanıcı yazacağı mesaj hakkında bir Subject girmelidir.
    Given Kullanici Managementon Schools sayfasina gider
    Then Kullanici contact butonuna tiklar
    Then Kullanici name bilgisi girer
    Then Kullanici email bilgisi girer
    Then Kullanici subject bilgisini bos birakir
    Then Kullanici message kutusuna mesajini girer
    And Kullanici 2 saniye bekler
    Then Kullanici send message butonuna tiklar
    And Required uyarisi alir

  @US-03-06
  Scenario: TC06 Kullanıcı mesaj yazmalıdır. Mesajında harf, rakam ve özel karakterler kullanabilmelidir.
    Given Kullanici Managementon Schools sayfasina gider
    Then Kullanici contact butonuna tiklar
    Then Kullanici name bilgisi girer
    Then Kullanici email bilgisi girer
    Then Kullanici subject bilgisi girer
    Then Kullanici harf,rakam ve ozel karakter iciren bir mesaj birakir
    And Kullanici 2 saniye bekler
    Then Kullanici send message butonuna tiklar
    And 'Contact Message Created Sucessfully' mesaji alir
    And sayfa kapatilir
