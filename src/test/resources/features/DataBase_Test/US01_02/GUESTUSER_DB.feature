@DB
  Feature:guest user bilgisi doğrulama

    Scenario Outline: KAYITLI  GUESTUSER BİLGİ  DOĞRULAMA  TESTİ
      Given DATABASE  bağlanılır
      And aday öğrenci  için  sorgulama  yapar
      And aday  öğrenci  için  doğrulama  yapar


      Examples:

        | id   | username     | name      | surname | birthday   | ssn         | birthplace | phonenumber  | gender |
        | 1172 | serbulentars | Serbulent | Arslan  | 1999-02-03 | 123-16-6636 | manisa     | 456-417-2125 | 0      |
