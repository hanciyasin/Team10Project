
  Feature: aday öğrenci oluşturma

   @REGİSTER
      

      Scenario Outline:US01_TC01
        When Siteye git
     And REGİSTER İKONUNA TIKLA
        And Name kısmına bie isim gir
        And Surname kısmını doldur
        And Birth place kısmını doldur
        And Phone kısmını doldur
        And Gender kısmından seçim yap
        And Date of birt kısmını doldur
        And Ssn kısmını doldur
        And Username kısmına tıkla ve doldur
        And Password kısmına tıkla ve doldur
        And Register Butonuna  tıkla
        And Çıkan ekranda succesful yazısının göründüğünü doğrula
        And Sayfayı kapat




     Examples:
       | username       | password           |
       | AdminBatch171 | Batch171+|
