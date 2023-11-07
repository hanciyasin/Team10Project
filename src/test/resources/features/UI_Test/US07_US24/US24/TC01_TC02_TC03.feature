Feature: US24 Admin Teacher olusturabilmeli

  Background:
    Given Kullanici anasayfaya gider
    When Kullanici Login tiklar
    And Kullanici User Name bilgisi girer
    And Kullanici Passsword bilgisi girer
    And Kullanici Login buttonuna tiklar


  Scenario Outline:TC02 Acilan Admin hesabindan Teacher olusturulur.
    Given admin clicks on Teacher Management Option
    When admin enter "<lesson>"
    And admin enter "<name>","<surname>"
    And admin enter "<birthplace>" , "<email>" , "<phonenumber>"
    And admin choose gender
    And admin enter "<dateofbirth>", "<ssn>", "<username>" and "<password>"
    And admin click on the submitt button
    Then verify Teacher saved successfully

    Examples:
      | lesson     | name    | surname | birthplace   | email            | phonenumber  | dateofbirth | ssn         | username | password |
      | Psychology | Samwise | Gamgee  | Middle Earth | samgam@gmail.com | 564-645-4565 | 06-04-1984  | 357-99-5373 | Samwise  | 123456Sg |

  Scenario: TC03 Olusturulan Teacher hesabina giris yapiir
    Given Kullanici "Managementon Schools" sayfasina gider.
    Then teacher icin olusturulan "<username>" bilgisi girer.
    Then teacher icin olusturulan "<password>" bilgisi girer.
    Then Login butonuna tiklar.