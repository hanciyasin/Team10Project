Feature: Vice Dean, ogrenci olusturabilmelidir.

  Background:
    Given Kullanici management school sayfasina gider
    Then Kullanici 3 saniye bekler
    Then Kullanici Login yazisina tiklar
    Then Kullanici User Name alanina "VDUserName" password alanina "VDPassword" degerini girip giris yapar
    Then Kullanici 1 saniye bekler
    Then kullanici menu'ye tiklar
    Then kullanici student management'a tiklar


  @US15_01
  Scenario: Tc01 Vice Dean Zorunlu alanlari girmeden kayit yapamamali
    Given Submit butonuna tiklar
    Then zorunlu alanlarda Required yazdigini dogrular
    And sayfa kapatilir


  @US15_02
  Scenario Outline: TC02 Vice Dean, öğrenci oluşturabilmelidir.(NegatifPhoneBilgileriEksik)
    Given Choose Advisor Teacher bölümünden ögretmen secer
    And Name alanina name girer
    And Surname alanina surname girer
    And Birthplace alanina yer girer
    And Email alanina email girer
    And "<Phone1>" alanina gecersiz numara girer(cizgisiz,on iki karakterden fazla veya on ikiden az)
    And Gender bölümünden cinsiyet secer
    And Date Of Birth alanina tarih girer
    And Ssn alanina ssn numarasini girer
    And Username alanina username girer
    And Fathername alanina fathername girer
    And Mothername alanina mothername girer
    And Password alanina password girer
    And Student Submit butonuna tiklar
    And Phone number should be exact 12 characters,Please Enter Valid Phone number yazisini veya Minimum oniki karakter yazisini görür
    And sayfa kapatilir
    Examples:
      | Phone1         |
      | 234875967185   |
      | 234-875-967185 |
      | 234-875-96     |


  @US15_03
  Scenario Outline: TC03 Vice Dean, öğrenci oluşturabilmelidir.(NegatifSsnBilgileriEksik)
    Given Choose Advisor Teacher bölümünden ögretmen secer
    And Name alanina name girer
    And Surname alanina surname girer
    And Birthplace alanina yer girer
    And Email alanina email girer
    And Phone alanina phone girer
    And Gender bölümünden cinsiyet secer
    And Date Of Birth alanina tarih girer
    And "<Ssn>" alanina gecersiz numara girer(cizgisiz,on bir karakterden fazla veya on birden az)
    And Username alanina username girer
    And Fathername alanina fathername girer
    And Mothername alanina mothername girer
    And Password alanina password girer
    And Student Submit butonuna tiklar
    And Please Enter Valid Ssn number yazisini veya Minimum on bir character (XXX-XXX-XXXX) yazisini görür.
    And sayfa kapatilir
    Examples:
      | Ssn          |
      | 34562794797  |
      | 345-34-34266 |
      | 316-98-45    |

  @US15_04
  Scenario Outline: TC04 Vice Dean, öğrenci oluşturabilmelidir.

    Given Choose Advisor Teacher bölümünden ögretmen secer
    Then Name alanina name girer
    And Surname alanina surname girer
    And Birthplace alanina yer girer
    And Email alanina email girer
    And Phone alanina phone girer
    And Gender bölümünden cinsiyet secer
    And Date Of Birth alanina tarih girer
    And Ssn alanina ssn numarasini girer
    And Username alanina "<kayitliusername>" girer
    And Fathername alanina fathername girer
    And Mothername alanina mothername girer
    And Password alanina password girer
    And Student Submit butonuna tiklar
    And Error: User with username Iskaya33 already register yazisini görür
    And sayfa kapatilir
    Examples:
      | kayitliusername |
      | Iskaya33 |

  @US15_05
  Scenario: TC05 Vice Dean, öğrenci oluşturabilmelidir.
    Given Choose Advisor Teacher bölümünden ögretmen secer
    And Name alanina name girer
    And Surname alanina surname girer
    And Birthplace alanina yer girer
    And Email alanina email girer
    And Phone alanina phone girer
    And Gender bölümünden cinsiyet secer
    And Date Of Birth alanina tarih girer
    And Ssn alanina ssn numarasini girer
    And Username alanina username girer
    And Fathername alanina fathername girer
    And Mothername alanina mothername girer
    And Password alanina password girer
    And Student Submit butonuna tiklar
    And kayit Dogrulanir
    And Page yazisini görene kadar scroll yapar
    And Sayfanin sag alt kösesindeki cift tirnaga tiklar
    And Page yazisini görene kadar tekrar scroll yapar
    And Ögrenci listesinin en sonunda olusturulan ögrencinin numarasinin otomatik geldigini dogrular.
    And sayfa kapatilir










