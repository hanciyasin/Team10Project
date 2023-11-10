@US12_API
Feature:Vice Dean ogretmene ders atayabilmelidir.

  @US12_API_TC01
  Scenario: TC001 Ders Programi olusturmalidir(Post)
    Given Lesson Program list eklemek icin Post request hazirligi yapilir
    And Gonderilecek Lesson Program bilgileri hazirlar
    When Lesson Program eklemek icin Post request gonderir
    Then Lesson Program List  bilgileri dogrular

  @US12_API_TC02
  Scenario: TC002 Pozitive Scenario silinen lesson Program dogrulanir (Delete)
    Given Kayitli lesson Program  verisinin delete request hazirligi yapilir
    When Kayitli lesson Program Id ile silinir
    Then Lesson Programin silindigini dogrular(delete)