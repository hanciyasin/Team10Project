@US_12
Feature: US012 Vice Dean ogretmene ders atamasi
  Background:Vice Dean login olur
    Given Kullanici "https://managementonschools.com" gider
    When Vice Dean hesabıyla login olur

  @US_12_TC01_02_03
  Scenario: TC01 Pozitive Scenario
    When Kullanici Lesson Program secenegini  tiklar
    Then Kullanici Choose Education Term menusunu tiklar ve donem  secer
    Then Kullanici Choose Day menusunu tiklar ve gun secer
    Then Kullanici Start Time menusunu tiklar ve gecerli bir saat girer
    Then Kullanici Stop Time menusunu tiklar ve gecerli bir saat girer ve submit eder
    And Kullanici Choose Lessons bölümüne oluşturulan dersin geldiği dogrular
    When Kullanici Choose Lessons bölümünden oluşturdugu dersi tiklar
    Then Kullanici Choose Teacher menusunu tiklar
    And  Kullanici ders için öğretmen seçilebilirligini dogrular
    Then Kullanici acilan menuden ogretmen secer ve submit eder
    And  Kullanici Lessons Added to Teacher uyari yazisinin gorundugunu dogrular

