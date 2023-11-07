Feature: US07 Dean kullaicilarin gonderdigi mesajlari gorebilmelidir.

  Background:
    Given kullanici management sayfasine gider
    Then kullanici 3 saniye bekler
    Then kullanici login elementine tiklar
    Then kullanici User Name alanina "dean" password alanina "123456Aa"
    Then kullanici 3 saniye bekler
    Then login butonuna tiklar

  Scenario: TC02 Dean, mesajlari, yazarlarini, e-maillerini, gonderilme tarihi ve
  subject bilgilerini goruntuluyebilmelidir.
    Given dean "Contact Get All" elementine tiklar.
    Then Message bilgisi gorunur
    Then Name bilgisi gorunur
    Then e-mail bilgisi gorunur
    Then Date bilgisi gorunur
    Then Subject bilgisi gorunur
