@US16_API
Feature: US016 Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.

  Scenario: TC001 Pozitive Scenario (Post)
    Given Mesaj eklemek icin post request hazirligi yapilir
    And Gonderilecek mesaj bilgileri hazirlanir
    When Mesaj eklemek icin post request gonderilir
    Then Mesaj bilgileri dogrulanir

  Scenario: TC002 Vice Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir (Get)
    Given Mesaj cagirmak icin get request hazirligi yapilir
    When Mesaj eklemek icin get request gonderilir
    Then Mesaj bilgileri dogrulanir(get)