@DB_US15
Feature: Vice Dean Öğrenci olusturabilmeli.

  Scenario: US15 Vice Dean Öğrenci sorgulama ve doğrulama
    Given Database'e bağlanır.
    And Aday öğrenci için sorgulama yapar.
    And Aday öğrenci için doğrulama yapar.