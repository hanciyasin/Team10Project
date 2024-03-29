@US07_API
Feature: US07 Dean, kullanıcıların gönderdiği mesajları görebilmelidir.

  Scenario: TC01 Mesaj gönderilir
    Given Mesaj eklemek icin post request hazirlanir
    And Gonderilecek mesaj bilgileri girilir
    When Mesaj eklemek icin post request yollanir
    Then Mesaj bilgileri kontrol edilir

  Scenario: TC002 Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve subject bilgilerini görüntüleyebilmelidir
    Given Mesaj cagirmak icin get request hazirlanir
    When Mesaj eklemek icin get request yollanir
    Then Mesaj infosu kontrol edilir