@US25
Feature: Admin Student oluşturma
  Background:Vice Dean login olur
    Given Kullanici "https://managementonschools.com" gider
    When Admin hesabıyla login olur

  @US_25_TC01_02
  Scenario: Admin Olarak Öğrenci Kaydı Oluştur
    And Sağ üst köşedeki Menu elementine tıkla
    And Student management yazısına tıkla
    And Öğrencinin danışman öğretmenini seç
    And Name alanına Öğrenci Adı gir
    And Surname alanına Öğrenci Soyadı gir
    And Birth Place alanına Doğum Yeri gir
    And E-mail alanına email gir
    And Telefon Numarası alanına numara gir
    And Cinsiyet seç
    And Doğum Tarihi alanına tarih gir
    And SSN alanına ssn gir
    And User Name alanına username gir
    And Father Name alanına Baba Adı gir
    And Mother Name alanına Anne Adı gir
    And Password alanına parola gir
    Then Öğrencinin oluştuğunu doğrula

