@REGİSTER
  Feature: OKUL UI TEST

  @REGİSTER
  Scenario: TC02-TC03-TC04-TC06-TC08-TC09 Name,Surname,BirthPlace,DateofBirth,Phone,SSN bos olamaz
    Given  admin siteye gider
    Then register ikonuna tiklar
    Then Zorunlu alan girilmedigi icin Name Required mesajini alir
    Then Zorunlu alan girilmedigi icin surname Required mesajini alir
    Then Zorunlu alan girilmedigi icin birthplace Required mesajini alir
    Then Zorunlu alan girilmedigi icin dateofbirth Required mesajini alir
    Then Zorunlu alan girilmedigi icin phone Required mesajini alir
    Then Zorunlu alan girilmedigi icin ssn Required mesajini alir



