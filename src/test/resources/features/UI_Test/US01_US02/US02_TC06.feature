
Feature: MİSAFİR KULLANICI

  Scenario:US02_TC06 ADAY ÖĞRENCİ KAYDI GÖRÜLÜP SİLİNEBİLMELİ
    Given kullanıcı Web sitesine gider
    When  login ELEMENTİNE tiklar
    And KAYITLI USERNAME GİRER
    And Kayıtlı password girer
    And login Butonuna tiklar
    And SAĞ ÜST KÖŞEDE MENÜ IKONUNA TIKLA
    And Açılan menüden guestuser butonuna tıkla
    And LİSTEDE PAGE 60 e git
    And SUAT username e sahip kaydın oluştuğunu gör
    And SUAT username sahip silme kutucuguna tıkla
    And Mali username ine sahip öğrenci kaydının silindiğini doğrula
    And delete succesfull yazısının göründüğünü doğrula
    And SAYFAYI KAPAT









