#@E2E
Feature: Admin Management

 # @US04
  Scenario Outline: TC01 Admin Dean ekleyebilmeli
    Given admin management school sayfasina gider
    Then Homepage login butonuna tiklar
    And Admin scenarioOutline ile propertiesden "<username>" ve "<password>" bilgilerini girer
    But Admin 3 saniye bekler
    And Menu elementine tiklanir
    But Admin 3 saniye bekler
    And Main menuden Dean Manegement secilir
    And Add Dean bolumunden Name bilgisi girer
    And Add Dean bolumunden Surname bilgisi girer
    And Add Dean bolumunden Birthplace bilgisi girer
    And Add Dean bolumunden Gender secer
    And Add Dean bolumunden DateOfBirth bilgisi girer
    And Add Dean bolumunden Phone bilgisi girer
    And Add Dean bolumunden SSN bilgisi girer
    And Add Dean bolumunden userName bilgisi girer
    And Add Dean bolumunden deanPassword bilgisi girer
    And Submit butonuna tiklar
    And sonuc mesaji gorunur
    And sayfa kapatilir

    Examples:
      | username       | password           |
      | manSchoolAdmin | manSchoolAdminPass |

  #@US04_05_API
  Scenario: Olusturulan Dean hesap bilgisini alma testi
    Given Kayitli Dean hesab bilgisinin ID nosu alinir
    And Dean GetManagerById icin URL duzenlenir
    And Dean GetManagerById icin beklenen veriler duzenlenir
    When Dean GetManagerById icin GET Request gonderilir ve Response alinir
    Then Status kodun 200 oldugu dogrulanir
    And Dean GetManagerById icin gelen Response body dogrulanir

  #@US04_DB
  Scenario: Kayıtlı Dean bilgisini dogrulama
    Given Database baglantisi kurulur
    And Dean icin beklenen veriler duzenlenir
    When Kayitli Dean hesab bilgisini almak icin Query gonderilir
    Then Kayitli Dean bilgisi dogrulanir
    And Database baglantisi kesilir

