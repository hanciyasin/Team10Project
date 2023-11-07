@US13
@US13-TC19

Feature: Vice Dean should be able to create teacher

  Background: Sign in as vice dean
    Given Kullanici anasayfaya girer
    When Kullanici Login  tiklar
    And Kullanici User Name girer
    And Kullanici Password girer
    And Kullanici Login butonuna tiklar
  @US13-TC01
  Scenario Outline:TC_01_create_teacher_successfully
    Given vice dean clicks on Teacher Management Option
    When vice dean enter "<lesson>"
    And vice dean enter1 "<name>","<surname>"
    And vice dean enter2 "<birthplace>" , "<email>" , "<phonenumber>"
    And vice dean choose gender
    And vice dean enter "<dateofbirth>", "<ssn>", "<username>" and "<password>"
    And vice dean click on the submitt button and scroll down the page
    Then verify teacher saved successfully

    Examples:
      | lesson   | name  | surname | birthplace | email            | phonenumber  | dateofbirth | ssn         | username   | password |
      | Business | Asuman | Asli   | New York    | Furk102@email02 | 516-586-5584 | 01-06-1976  | 333-69-3073 | Asuman99 | 959654Aa |

@US13-TC02-03-04-05-06-08-09-10-11-12
  Scenario Outline: Doldurulmasi gerekli alanlar bos birakilirsa Required yazisi gorunmeli
    Then Menu'ye tikla
    Then Teacher liste tikla
    Then   "<name>","<surname>" bos birak
    And "<birthplace>" , "<email>" , "<phonenumber>", "<ssn>", "<username>" and "<password>" bos birak
     And  submit butonuna tikla
    Then Required yazisinin ciktigini dogrula
    Examples:
     |   name| surname  |  birthplace   | email |   phonenumber |    ssn | username |   password |
     |       |          |               |       |               |        |         |            |

@US13-TC07
Scenario Outline: is Advisor Teacher secilmeden ogretmen olusmali
  Given Menu'ye tikla
  Then Teacher liste tikla
  Then "<lesson>", "<name>", "<surname>", "<birthplace>" , "<email>" , "<phonenumber>","<dateofbirth>", "<ssn>", "<username>" and "<password>" gir
  Then submit butonuna tikla
  Then Invalid Male Female yazisinin goruldugunu dogrula
  Examples:
    | lesson   | name  | surname | birthplace | email            | phonenumber  | dateofbirth | ssn         | username   | password |
    | Business | Ahmet | Turk   | New York    | met102@email02 | 516-536-5587 | 01-06-1979  | 333-99-3361    | suman790 | 987654ABb |

@US13-TC13
Scenario Outline: 9 rakamli SSN ile giris yapilamaz
  Given vice dean clicks on Teacher Management Option
  Then "<lesson>", "<name>", "<surname>", "<birthplace>" , "<email>" , "<phonenumber>","<dateofbirth>", "<ssn>", "<username>" and "<password>" gir
  Then vice dean choose gender
  Then submit butonuna tikla
  Then EnterValidSSN yazisinin goruldugunu dgrula
Examples:
  | lesson   | name  | surname | birthplace | email            | phonenumber  | dateofbirth |  ssn         | username   | password |
  | Business | Ahmet | Kurt   | New         | Det102@email02   | 516-536-5487 | 01-06-1979  | 333-99-33612 |Tuman790 | 917654ABb |

@US13-TC14
Scenario Outline: "-" icermeyen 11 rakamli SSN ile giris yapilmamali
  Given vice dean clicks on Teacher Management Option
  Then "<lesson>", "<name>", "<surname>", "<birthplace>" , "<email>" , "<phonenumber>","<dateofbirth>", "<ssn>", "<username>" and "<password>" gir
  Then vice dean choose gender
  Then submit butonuna tikla
  Then EnterValidSSN yazisinin goruldugunu dogrula
Examples:
  | lesson   | name  | surname | birthplace | email            | phonenumber  | dateofbirth |  ssn         | username   | password |
  | Business | Akif  | Kurt    | Artvin     | Met102@email02   | 512-536-5487 | 01-09-1979  | 333399733612 |kuman790    | 321654ABb|

  @US13-TC15
Scenario Outline:"-" iceren 8 rakamli SSN ile kayip yapilamamali
  Given vice dean clicks on Teacher Management Option
  Then "<lesson>", "<name>", "<surname>", "<birthplace>" , "<email>" , "<phonenumber>","<dateofbirth>", "<ssn>", "<username>" and "<password>" gir
  Then vice dean choose gender
  Then submit butonuna tikla
  Then EnterValidSSN yazisinin goruldugunu dogrula

  Examples:
    | lesson   | name  | surname | birthplace | email          | phonenumber  | dateofbirth |  ssn         | username   | password |
    | Business | Atif  | Kurt    | Ordu     | Det102@email02   | 522-536-5487 | 01-03-1979  | 313-26-176   |Yuman790    | 521654ABb|

@US13-TC16
Scenario Outline: 7 karakterli bir Password ile giris yapilamaz
  Given vice dean clicks on Teacher Management Option
  Then "<lesson>", "<name>", "<surname>", "<birthplace>" , "<email>" , "<phonenumber>","<dateofbirth>", "<ssn>", "<username>" and "<password>" gir
  Then vice dean choose gender
  Then submit butonuna tikla
  Then confirm cant be entered with seven character

  Examples:
    | lesson   | name  | surname | birthplace | email          | phonenumber  | dateofbirth |  ssn         | username   | password |
    | Business | Atif  | Kurt    | Ordu     | Det102@email02   | 522-536-5487 | 01-03-1979  | 313-26-1762   |Yuman790    | 5216ABb|

@US13-TC17
Scenario Outline: Buyuk harf icermeyen bir Password ile giris yapilmamali
  Given vice dean clicks on Teacher Management Option
  Then "<lesson>", "<name>", "<surname>", "<birthplace>" , "<email>" , "<phonenumber>","<dateofbirth>", "<ssn>", "<username>" and "<password>" gir
  Then vice dean choose gender
  Then submit butonuna tikla
  Then confirm cant be entered with password have no uppercase letter

  Examples:
    | lesson   | name  | surname | birthplace | email          | phonenumber  | dateofbirth |  ssn         | username   | password |
    | Business | Osman  | Turt    | Ordu     | Let102@email02   | 502-536-5487 | 01-07-1979  | 813-26-1762   |Human790    | 5216aklb|

@US13-TC18
Scenario Outline: Kucuk harf icermeyen bir Password ile giris yapilmamali
  Given vice dean clicks on Teacher Management Option
  Then "<lesson>", "<name>", "<surname>", "<birthplace>" , "<email>" , "<phonenumber>","<dateofbirth>", "<ssn>", "<username>" and "<password>" gir
  Then vice dean choose gender
  Then submit butonuna tikla
  Then confirm cant be entered with password have no lowercase letter

  Examples:
    | lesson   | name  | surname | birthplace | email          | phonenumber  | dateofbirth |  ssn         | username   | password |
    | Business | Niyazi  | Durt    | Ordu     | Pet102@email02   | 572-536-5487 | 08-07-1979  | 813-26-1362   |Luman790    | 5216AKLB|

@US13-TC19
Scenario Outline: Rakam icermeyen bir Password ile giris yapilmamali
  Given vice dean clicks on Teacher Management Option
  Then "<lesson>", "<name>", "<surname>", "<birthplace>" , "<email>" , "<phonenumber>","<dateofbirth>", "<ssn>", "<username>" and "<password>" gir
  Then vice dean choose gender
  Then submit butonuna tikla
  Then confirm cant be entered with password have no number

  Examples:
    | lesson   | name  | surname | birthplace | email          | phonenumber  | dateofbirth |  ssn         | username   | password |
    | Business | Mustafa  | Zurt    | Antalya     | Tet102@email02   | 512-536-5487 | 08-04-1979  | 819-26-1362   |Muman790    | akn?AKLB|






